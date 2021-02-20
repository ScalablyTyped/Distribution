package typings.emotionStylis

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("@emotion/stylis", JSImport.Default)
  @js.native
  val default: StylisConstructor = js.native
  
  @js.native
  sealed trait Context extends StObject
  @JSImport("@emotion/stylis", "Context")
  @js.native
  object Context extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Context with Double] = js.native
    
    @js.native
    sealed trait ATRUL
      extends Context
         with PrefixContext
    /* 3 */ val ATRUL: typings.emotionStylis.mod.Context.ATRUL with Double = js.native
    
    @js.native
    sealed trait BLCKS
      extends Context
         with PrefixContext
    /* 2 */ val BLCKS: typings.emotionStylis.mod.Context.BLCKS with Double = js.native
    
    @js.native
    sealed trait POSTS extends Context
    /* -2 */ val POSTS: typings.emotionStylis.mod.Context.POSTS with Double = js.native
    
    @js.native
    sealed trait PREPS extends Context
    /* -1 */ val PREPS: typings.emotionStylis.mod.Context.PREPS with Double = js.native
    
    @js.native
    sealed trait PROPS
      extends Context
         with PrefixContext
    /* 1 */ val PROPS: typings.emotionStylis.mod.Context.PROPS with Double = js.native
    
    @js.native
    sealed trait UNKWN extends Context
    /* 0 */ val UNKWN: typings.emotionStylis.mod.Context.UNKWN with Double = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@emotion/stylis", JSImport.Default)
  @js.native
  class defaultCls () extends Stylis {
    def this(options: Options) = this()
  }
  
  @js.native
  trait ArrayPlugable extends Array[Plugable]
  
  @js.native
  trait Options extends StObject {
    
    var prefix: js.UndefOr[Prefix] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrefix(value: Prefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixFunction3(value: (/* key */ String, /* value */ String, /* context */ PrefixContext) => Boolean): Self = StObject.set(x, "prefix", js.Any.fromFunction3(value))
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  type Plugable = js.UndefOr[Null | Boolean | Plugin | ArrayPlugable]
  
  type Plugin = js.ThisFunction9[
    /* this */ Stylis, 
    /* context */ Context, 
    /* content */ js.Any, 
    /* selector */ js.Array[String], 
    /* parent */ js.Array[String], 
    /* line */ Double, 
    /* column */ Double, 
    /* length */ Double, 
    /* at */ Double, 
    /* depth */ Double, 
    js.Any
  ]
  
  type Prefix = Boolean | (js.Function3[/* key */ String, /* value */ String, /* context */ PrefixContext, Boolean])
  
  /* Rewritten from type alias, can be one of: 
    - typings.emotionStylis.mod.Context.PROPS
    - typings.emotionStylis.mod.Context.BLCKS
    - typings.emotionStylis.mod.Context.ATRUL
  */
  trait PrefixContext extends StObject
  
  @js.native
  trait Stylis extends StylisConstructor {
    
    def apply(selector: String, properties: String): js.Any = js.native
    
    def set(options: Options): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @emotion/stylis.@emotion/stylis.StylisSet */ js.Object = js.native
    @JSName("set")
    var set_Original: StylisSet = js.native
    
    def use(): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @emotion/stylis.@emotion/stylis.StylisUse */ js.Object = js.native
    def use(plugin: Plugable): /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @emotion/stylis.@emotion/stylis.StylisUse */ js.Object = js.native
    @JSName("use")
    var use_Original: StylisUse = js.native
  }
  
  @js.native
  trait StylisConstructor
    extends Instantiable0[Stylis]
       with Instantiable1[/* options */ Options, Stylis]
  
  type StylisSet = js.Function1[
    /* options */ Options, 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @emotion/stylis.@emotion/stylis.StylisSet */ js.Object
  ]
  
  type StylisUse = js.Function1[
    /* plugin */ js.UndefOr[Plugable], 
    /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias @emotion/stylis.@emotion/stylis.StylisUse */ js.Object
  ]
  
  type _To = StylisConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: StylisConstructor = default
}
