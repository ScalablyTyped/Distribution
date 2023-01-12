package typings.emotionStylis

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    def apply(value: Double): js.UndefOr[Context & Double] = js.native
    
    @js.native
    sealed trait ATRUL
      extends StObject
         with Context
         with PrefixContext
    /* 3 */ val ATRUL: typings.emotionStylis.mod.Context.ATRUL & Double = js.native
    
    @js.native
    sealed trait BLCKS
      extends StObject
         with Context
         with PrefixContext
    /* 2 */ val BLCKS: typings.emotionStylis.mod.Context.BLCKS & Double = js.native
    
    @js.native
    sealed trait POSTS
      extends StObject
         with Context
    /* -2 */ val POSTS: typings.emotionStylis.mod.Context.POSTS & Double = js.native
    
    @js.native
    sealed trait PREPS
      extends StObject
         with Context
    /* -1 */ val PREPS: typings.emotionStylis.mod.Context.PREPS & Double = js.native
    
    @js.native
    sealed trait PROPS
      extends StObject
         with Context
         with PrefixContext
    /* 1 */ val PROPS: typings.emotionStylis.mod.Context.PROPS & Double = js.native
    
    @js.native
    sealed trait UNKWN
      extends StObject
         with Context
    /* 0 */ val UNKWN: typings.emotionStylis.mod.Context.UNKWN & Double = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@emotion/stylis", JSImport.Default)
  @js.native
  open class defaultCls ()
    extends StObject
       with Stylis {
    def this(options: Options) = this()
  }
  
  type ArrayPlugable = js.Array[Plugable]
  
  trait Options extends StObject {
    
    var prefix: js.UndefOr[Prefix] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setPrefix(value: Prefix): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixFunction3(value: (/* key */ String, /* value */ String, /* context */ PrefixContext) => Boolean): Self = StObject.set(x, "prefix", js.Any.fromFunction3(value))
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    }
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type Plugable = undefined | null | boolean | @emotion/stylis.@emotion/stylis.Plugin | @emotion/stylis.@emotion/stylis.ArrayPlugable
  }}}
  to avoid circular code involving: 
  - @emotion/stylis.@emotion/stylis.ArrayPlugable
  - @emotion/stylis.@emotion/stylis.Plugable
  */
  type Plugable = js.UndefOr[Null | Boolean | Plugin | Any]
  
  type Plugin = js.ThisFunction9[
    /* this */ Stylis, 
    /* context */ Context, 
    /* content */ Any, 
    /* selector */ js.Array[String], 
    /* parent */ js.Array[String], 
    /* line */ Double, 
    /* column */ Double, 
    /* length */ Double, 
    /* at */ Double, 
    /* depth */ Double, 
    Any
  ]
  
  type Prefix = Boolean | (js.Function3[/* key */ String, /* value */ String, /* context */ PrefixContext, Boolean])
  
  /* Rewritten from type alias, can be one of: 
    - typings.emotionStylis.mod.Context.PROPS
    - typings.emotionStylis.mod.Context.BLCKS
    - typings.emotionStylis.mod.Context.ATRUL
  */
  trait PrefixContext extends StObject
  
  @js.native
  trait Stylis
    extends StObject
       with StylisConstructor {
    
    def apply(selector: String, properties: String): Any = js.native
    
    def set(options: Options): StylisSet = js.native
    @JSName("set")
    var set_Original: StylisSet = js.native
    
    def use(): StylisUse = js.native
    def use(plugin: Plugable): StylisUse = js.native
    @JSName("use")
    var use_Original: StylisUse = js.native
  }
  
  @js.native
  trait StylisConstructor
    extends StObject
       with Instantiable0[Stylis]
       with Instantiable1[/* options */ Options, Stylis]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type StylisSet = (options : @emotion/stylis.@emotion/stylis.Options): @emotion/stylis.@emotion/stylis.StylisSet
  }}}
  to avoid circular code involving: 
  - @emotion/stylis.@emotion/stylis.StylisSet
  */
  @js.native
  trait StylisSet extends StObject {
    
    def apply(options: Options): StylisSet = js.native
  }
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type StylisUse = (plugin : @emotion/stylis.@emotion/stylis.Plugable | undefined): @emotion/stylis.@emotion/stylis.StylisUse
  }}}
  to avoid circular code involving: 
  - @emotion/stylis.@emotion/stylis.ArrayPlugable
  - @emotion/stylis.@emotion/stylis.Plugable
  - @emotion/stylis.@emotion/stylis.StylisUse
  */
  @js.native
  trait StylisUse extends StObject {
    
    def apply(): StylisUse = js.native
    def apply(plugin: Plugable): StylisUse = js.native
  }
  
  type _To = StylisConstructor
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: StylisConstructor = default
}
