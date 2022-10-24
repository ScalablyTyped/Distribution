package typings.esbuildWasm.libBrowserMod

import org.scalablytyped.runtime.StringDictionary
import typings.esbuildWasm.anon.Bytes
import typings.esbuildWasm.anon.CssBundle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metafile extends StObject {
  
  var inputs: StringDictionary[Bytes]
  
  var outputs: StringDictionary[CssBundle]
}
object Metafile {
  
  inline def apply(inputs: StringDictionary[Bytes], outputs: StringDictionary[CssBundle]): Metafile = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metafile]
  }
  
  extension [Self <: Metafile](x: Self) {
    
    inline def setInputs(value: StringDictionary[Bytes]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: StringDictionary[CssBundle]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
  }
}
