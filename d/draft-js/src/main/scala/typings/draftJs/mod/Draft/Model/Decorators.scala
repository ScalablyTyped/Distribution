package typings.draftJs.mod.Draft.Model

import org.scalablytyped.runtime.Instantiable1
import typings.draftJs.anon.TypeofComponent
import typings.draftJs.draftJsStrings.ltr_
import typings.draftJs.draftJsStrings.rtl_
import typings.draftJs.mod.Draft.Model.ImmutableData.ContentBlock
import typings.draftJs.mod.Draft.Model.ImmutableData.ContentState
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Decorators {
  
  /**
    * A CompositeDraftDecorator traverses through a list of DraftDecorator
    * instances to identify sections of a ContentBlock that should be rendered
    * in a "decorated" manner. For example, hashtags, mentions, and links may
    * be intended to stand out visually, be rendered as anchors, etc.
    *
    * The list of decorators supplied to the constructor will be used in the
    * order they are provided. This allows the caller to specify a priority for
    * string matching, in case of match collisions among decorators.
    *
    * For instance, I may have a link with a `#` in its text. Though this section
    * of text may match our hashtag decorator, it should not be treated as a
    * hashtag. I should therefore list my link DraftDecorator
    * before my hashtag DraftDecorator when constructing this composite
    * decorator instance.
    *
    * Thus, when a collision like this is encountered, the earlier match is
    * preserved and the new match is discarded.
    */
  trait CompositeDraftDecorator extends StObject {
    
    def getComponentForKey(key: String): js.Function
    
    def getDecorations(block: ContentBlock, contentState: ContentState): typings.immutable.mod.List[String]
    
    def getPropsForKey(key: String): js.Object
  }
  object CompositeDraftDecorator {
    
    inline def apply(
      getComponentForKey: String => js.Function,
      getDecorations: (ContentBlock, ContentState) => typings.immutable.mod.List[String],
      getPropsForKey: String => js.Object
    ): CompositeDraftDecorator = {
      val __obj = js.Dynamic.literal(getComponentForKey = js.Any.fromFunction1(getComponentForKey), getDecorations = js.Any.fromFunction2(getDecorations), getPropsForKey = js.Any.fromFunction1(getPropsForKey))
      __obj.asInstanceOf[CompositeDraftDecorator]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompositeDraftDecorator] (val x: Self) extends AnyVal {
      
      inline def setGetComponentForKey(value: String => js.Function): Self = StObject.set(x, "getComponentForKey", js.Any.fromFunction1(value))
      
      inline def setGetDecorations(value: (ContentBlock, ContentState) => typings.immutable.mod.List[String]): Self = StObject.set(x, "getDecorations", js.Any.fromFunction2(value))
      
      inline def setGetPropsForKey(value: String => js.Object): Self = StObject.set(x, "getPropsForKey", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * A DraftDecorator is a strategy-component pair intended for use when
    * rendering content.
    *
    *   - A "strategy": A function that accepts a ContentBlock object and
    *     continuously executes a callback with start/end values corresponding to
    *     relevant matches in the document text. For example, getHashtagMatches
    *     uses a hashtag regex to find hashtag strings in the block, and
    *     for each hashtag match, executes the callback with start/end pairs.
    *
    *   - A "component": A React component that will be used to render the
    *     "decorated" section of text.
    *
    *   - "props": Props to be passed into the React component that will be used
    *     merged with DraftDecoratorComponentProps
    */
  trait DraftDecorator[P] extends StObject {
    
    var component: (Component[js.Object, js.Object, Any]) | (TypeofComponent & (Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
        Component[js.Object, js.Object, js.Object]
      ])) | (js.Function1[/* props */ DraftDecoratorComponentProps & P, ReactNode])
    
    var props: js.UndefOr[P] = js.undefined
    
    def strategy(
      block: ContentBlock,
      callback: js.Function2[/* start */ Double, /* end */ Double, Unit],
      contentState: ContentState
    ): Unit
  }
  object DraftDecorator {
    
    inline def apply[P](
      component: (Component[js.Object, js.Object, Any]) | (TypeofComponent & (Instantiable1[
          /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
          Component[js.Object, js.Object, js.Object]
        ])) | (js.Function1[/* props */ DraftDecoratorComponentProps & P, ReactNode]),
      strategy: (ContentBlock, js.Function2[/* start */ Double, /* end */ Double, Unit], ContentState) => Unit
    ): DraftDecorator[P] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], strategy = js.Any.fromFunction3(strategy))
      __obj.asInstanceOf[DraftDecorator[P]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DraftDecorator[?], P] (val x: Self & DraftDecorator[P]) extends AnyVal {
      
      inline def setComponent(
        value: (Component[js.Object, js.Object, Any]) | (TypeofComponent & (Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam P */ /* props */ Any, 
              Component[js.Object, js.Object, js.Object]
            ])) | (js.Function1[/* props */ DraftDecoratorComponentProps & P, ReactNode])
      ): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentFunction1(value: /* props */ DraftDecoratorComponentProps & P => ReactNode): Self = StObject.set(x, "component", js.Any.fromFunction1(value))
      
      inline def setProps(value: P): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
      
      inline def setStrategy(
        value: (ContentBlock, js.Function2[/* start */ Double, /* end */ Double, Unit], ContentState) => Unit
      ): Self = StObject.set(x, "strategy", js.Any.fromFunction3(value))
    }
  }
  
  /**
    * DraftDecoratorComponentProps are the core set of props that will be
    * passed to all DraftDecoratorComponents if a Custom Block Component is not used.
    * Note that a component may also accept additional props outside of this list.
    */
  trait DraftDecoratorComponentProps extends StObject {
    
    var blockKey: String
    
    var children: js.UndefOr[js.Array[ReactNode]] = js.undefined
    
    var contentState: ContentState
    
    var decoratedText: String
    
    var dir: js.UndefOr[ltr_ | rtl_] = js.undefined
    
    var end: Double
    
    // Many folks mistakenly assume that there will always be an 'entityKey'
    // passed to a DecoratorComponent.
    // To find the `entityKey`, Draft calls
    // `contentBlock.getEntityKeyAt(leafNode)` and in many cases the leafNode does
    // not have an entityKey. In those cases the entityKey will be null or
    // undefined. That's why `getEntityKeyAt()` is typed to return `?string`.
    // See https://github.com/facebook/draft-js/blob/2da3dcb1c4c106d1b2a0f07b3d0275b8d724e777/src/model/immutable/BlockNode.js#L51
    var entityKey: js.UndefOr[String] = js.undefined
    
    var offsetKey: String
    
    var start: Double
  }
  object DraftDecoratorComponentProps {
    
    inline def apply(
      blockKey: String,
      contentState: ContentState,
      decoratedText: String,
      end: Double,
      offsetKey: String,
      start: Double
    ): DraftDecoratorComponentProps = {
      val __obj = js.Dynamic.literal(blockKey = blockKey.asInstanceOf[js.Any], contentState = contentState.asInstanceOf[js.Any], decoratedText = decoratedText.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], offsetKey = offsetKey.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[DraftDecoratorComponentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DraftDecoratorComponentProps] (val x: Self) extends AnyVal {
      
      inline def setBlockKey(value: String): Self = StObject.set(x, "blockKey", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[ReactNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setContentState(value: ContentState): Self = StObject.set(x, "contentState", value.asInstanceOf[js.Any])
      
      inline def setDecoratedText(value: String): Self = StObject.set(x, "decoratedText", value.asInstanceOf[js.Any])
      
      inline def setDir(value: ltr_ | rtl_): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEntityKey(value: String): Self = StObject.set(x, "entityKey", value.asInstanceOf[js.Any])
      
      inline def setEntityKeyUndefined: Self = StObject.set(x, "entityKey", js.undefined)
      
      inline def setOffsetKey(value: String): Self = StObject.set(x, "offsetKey", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * An interface for document decorator classes, allowing the creation of
    * custom decorator classes.
    *
    * See `CompositeDraftDecorator` for the most common use case.
    */
  trait DraftDecoratorType extends StObject {
    
    /**
      * Given a decorator key, return the component to use when rendering
      * this decorated range.
      */
    def getComponentForKey(key: String): js.Function
    
    /**
      * Given a `ContentBlock`, return an immutable List of decorator keys.
      */
    def getDecorations(block: ContentBlock, contentState: ContentState): typings.immutable.mod.List[String]
    
    /**
      * Given a decorator key, optionally return the props to use when rendering
      * this decorated range.
      */
    def getPropsForKey(key: String): Any
  }
  object DraftDecoratorType {
    
    inline def apply(
      getComponentForKey: String => js.Function,
      getDecorations: (ContentBlock, ContentState) => typings.immutable.mod.List[String],
      getPropsForKey: String => Any
    ): DraftDecoratorType = {
      val __obj = js.Dynamic.literal(getComponentForKey = js.Any.fromFunction1(getComponentForKey), getDecorations = js.Any.fromFunction2(getDecorations), getPropsForKey = js.Any.fromFunction1(getPropsForKey))
      __obj.asInstanceOf[DraftDecoratorType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DraftDecoratorType] (val x: Self) extends AnyVal {
      
      inline def setGetComponentForKey(value: String => js.Function): Self = StObject.set(x, "getComponentForKey", js.Any.fromFunction1(value))
      
      inline def setGetDecorations(value: (ContentBlock, ContentState) => typings.immutable.mod.List[String]): Self = StObject.set(x, "getDecorations", js.Any.fromFunction2(value))
      
      inline def setGetPropsForKey(value: String => Any): Self = StObject.set(x, "getPropsForKey", js.Any.fromFunction1(value))
    }
  }
}
