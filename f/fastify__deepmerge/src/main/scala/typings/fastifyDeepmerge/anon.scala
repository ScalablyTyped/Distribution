package typings.fastifyDeepmerge

import typings.fastifyDeepmerge.fastifyDeepmergeBooleans.`true`
import typings.fastifyDeepmerge.mod.MergeArrayFn
import typings.fastifyDeepmerge.mod.MergeArrayFnOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @fastify/deepmerge.@fastify/deepmerge.Options & {  all :true} */
  trait Optionsalltrue extends StObject {
    
    var all: js.UndefOr[Boolean] & `true`
    
    var mergeArray: js.UndefOr[MergeArrayFn] = js.undefined
    
    var symbols: js.UndefOr[Boolean] = js.undefined
  }
  object Optionsalltrue {
    
    inline def apply(all: js.UndefOr[Boolean] & `true`): Optionsalltrue = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
      __obj.asInstanceOf[Optionsalltrue]
    }
    
    extension [Self <: Optionsalltrue](x: Self) {
      
      inline def setAll(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setMergeArray(
        value: /* options */ MergeArrayFnOptions => js.Function2[/* target */ js.Array[Any], /* source */ js.Array[Any], js.Array[Any]]
      ): Self = StObject.set(x, "mergeArray", js.Any.fromFunction1(value))
      
      inline def setMergeArrayUndefined: Self = StObject.set(x, "mergeArray", js.undefined)
      
      inline def setSymbols(value: Boolean): Self = StObject.set(x, "symbols", value.asInstanceOf[js.Any])
      
      inline def setSymbolsUndefined: Self = StObject.set(x, "symbols", js.undefined)
    }
  }
}
