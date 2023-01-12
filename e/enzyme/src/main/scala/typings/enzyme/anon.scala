package typings.enzyme

import org.scalablytyped.runtime.StringDictionary
import typings.enzyme.mod.EnzymeAdapter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Adapter extends StObject {
    
    var adapter: EnzymeAdapter
    
    // See https://github.com/airbnb/enzyme/blob/enzyme@3.10.0/docs/guides/migration-from-2-to-3.md#lifecycle-methods
    // Actually, `{adapter:} & Pick<ShallowRendererProps,"disableLifecycleMethods">` is more precise. However,
    // in that case jsdoc won't be shown
    /**
      * If set to true, componentDidMount is not called on the component, and componentDidUpdate is not called after
      * setProps and setContext. Default to false.
      */
    var disableLifecycleMethods: js.UndefOr[Boolean] = js.undefined
  }
  object Adapter {
    
    inline def apply(adapter: EnzymeAdapter): Adapter = {
      val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
      __obj.asInstanceOf[Adapter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Adapter] (val x: Self) extends AnyVal {
      
      inline def setAdapter(value: EnzymeAdapter): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      inline def setDisableLifecycleMethods(value: Boolean): Self = StObject.set(x, "disableLifecycleMethods", value.asInstanceOf[js.Any])
      
      inline def setDisableLifecycleMethodsUndefined: Self = StObject.set(x, "disableLifecycleMethods", js.undefined)
    }
  }
  
  trait Dictkey
    extends StObject
       with // TODO Maybe some life cycle are missing
  /* lifecycleName */ StringDictionary[Any] {
    
    var calledByRenderer: Boolean
  }
  object Dictkey {
    
    inline def apply(calledByRenderer: Boolean): Dictkey = {
      val __obj = js.Dynamic.literal(calledByRenderer = calledByRenderer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def setCalledByRenderer(value: Boolean): Self = StObject.set(x, "calledByRenderer", value.asInstanceOf[js.Any])
    }
  }
  
  trait HasShouldComponentUpdateBug extends StObject {
    
    var hasShouldComponentUpdateBug: Boolean
  }
  object HasShouldComponentUpdateBug {
    
    inline def apply(hasShouldComponentUpdateBug: Boolean): HasShouldComponentUpdateBug = {
      val __obj = js.Dynamic.literal(hasShouldComponentUpdateBug = hasShouldComponentUpdateBug.asInstanceOf[js.Any])
      __obj.asInstanceOf[HasShouldComponentUpdateBug]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HasShouldComponentUpdateBug] (val x: Self) extends AnyVal {
      
      inline def setHasShouldComponentUpdateBug(value: Boolean): Self = StObject.set(x, "hasShouldComponentUpdateBug", value.asInstanceOf[js.Any])
    }
  }
  
  trait IgnoreProps extends StObject {
    
    /** Whether props should be omitted in the resulting string. Props are included by default. */
    var ignoreProps: js.UndefOr[Boolean] = js.undefined
    
    /** Whether arrays and objects passed as props should be verbosely printed. */
    var verbose: js.UndefOr[Boolean] = js.undefined
  }
  object IgnoreProps {
    
    inline def apply(): IgnoreProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IgnoreProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IgnoreProps] (val x: Self) extends AnyVal {
      
      inline def setIgnoreProps(value: Boolean): Self = StObject.set(x, "ignoreProps", value.asInstanceOf[js.Any])
      
      inline def setIgnorePropsUndefined: Self = StObject.set(x, "ignoreProps", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    }
  }
  
  trait OnSetState extends StObject {
    
    var onSetState: Boolean
    
    var prevContext: Boolean
  }
  object OnSetState {
    
    inline def apply(onSetState: Boolean, prevContext: Boolean): OnSetState = {
      val __obj = js.Dynamic.literal(onSetState = onSetState.asInstanceOf[js.Any], prevContext = prevContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnSetState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnSetState] (val x: Self) extends AnyVal {
      
      inline def setOnSetState(value: Boolean): Self = StObject.set(x, "onSetState", value.asInstanceOf[js.Any])
      
      inline def setPrevContext(value: Boolean): Self = StObject.set(x, "prevContext", value.asInstanceOf[js.Any])
    }
  }
}
