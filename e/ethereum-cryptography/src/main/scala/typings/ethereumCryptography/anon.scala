package typings.ethereumCryptography

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: Unit
    
    var noncefn: Unit
  }
  object Data {
    
    inline def apply(data: Unit, noncefn: Unit): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], noncefn = noncefn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setData(value: Unit): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setNoncefn(value: Unit): Self = StObject.set(x, "noncefn", value.asInstanceOf[js.Any])
    }
  }
  
  trait Hashfn extends StObject {
    
    var data: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var hashfn: js.UndefOr[
        js.Function3[
          /* x */ js.typedarray.Uint8Array, 
          /* y */ js.typedarray.Uint8Array, 
          /* data */ js.typedarray.Uint8Array, 
          js.typedarray.Uint8Array
        ]
      ] = js.undefined
    
    var xbuf: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
    
    var ybuf: js.UndefOr[js.typedarray.Uint8Array] = js.undefined
  }
  object Hashfn {
    
    inline def apply(): Hashfn = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Hashfn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Hashfn] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHashfn(
        value: (/* x */ js.typedarray.Uint8Array, /* y */ js.typedarray.Uint8Array, /* data */ js.typedarray.Uint8Array) => js.typedarray.Uint8Array
      ): Self = StObject.set(x, "hashfn", js.Any.fromFunction3(value))
      
      inline def setHashfnUndefined: Self = StObject.set(x, "hashfn", js.undefined)
      
      inline def setXbuf(value: js.typedarray.Uint8Array): Self = StObject.set(x, "xbuf", value.asInstanceOf[js.Any])
      
      inline def setXbufUndefined: Self = StObject.set(x, "xbuf", js.undefined)
      
      inline def setYbuf(value: js.typedarray.Uint8Array): Self = StObject.set(x, "ybuf", value.asInstanceOf[js.Any])
      
      inline def setYbufUndefined: Self = StObject.set(x, "ybuf", js.undefined)
    }
  }
}
