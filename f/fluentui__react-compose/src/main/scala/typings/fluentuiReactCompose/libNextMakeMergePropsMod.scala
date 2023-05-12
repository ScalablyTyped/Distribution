package typings.fluentuiReactCompose

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libNextMakeMergePropsMod {
  
  @JSImport("@fluentui/react-compose/lib/next/makeMergeProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def makeMergeProps[TState](): js.Function2[
    /* target */ Record[String, Any], 
    /* repeated */ js.UndefOr[Record[String, Any]], 
    TState
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMergeProps")().asInstanceOf[js.Function2[
    /* target */ Record[String, Any], 
    /* repeated */ js.UndefOr[Record[String, Any]], 
    TState
  ]]
  inline def makeMergeProps[TState](options: MergePropsOptions): js.Function2[
    /* target */ Record[String, Any], 
    /* repeated */ js.UndefOr[Record[String, Any]], 
    TState
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMergeProps")(options.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* target */ Record[String, Any], 
    /* repeated */ js.UndefOr[Record[String, Any]], 
    TState
  ]]
  
  trait MergePropsOptions extends StObject {
    
    /**
      * A list of props to deep merge. By default, `style` will
      * always be deep merged so it's not required to be provided.
      */
    var deepMerge: js.UndefOr[js.Array[String]] = js.undefined
  }
  object MergePropsOptions {
    
    inline def apply(): MergePropsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MergePropsOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MergePropsOptions] (val x: Self) extends AnyVal {
      
      inline def setDeepMerge(value: js.Array[String]): Self = StObject.set(x, "deepMerge", value.asInstanceOf[js.Any])
      
      inline def setDeepMergeUndefined: Self = StObject.set(x, "deepMerge", js.undefined)
      
      inline def setDeepMergeVarargs(value: String*): Self = StObject.set(x, "deepMerge", js.Array(value*))
    }
  }
}
