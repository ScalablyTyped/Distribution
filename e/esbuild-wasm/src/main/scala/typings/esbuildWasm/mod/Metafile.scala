package typings.esbuildWasm.mod

import org.scalablytyped.runtime.StringDictionary
import typings.esbuildWasm.anon.Exports
import typings.esbuildWasm.anon.Imports
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metafile extends StObject {
  
  var inputs: StringDictionary[Imports]
  
  var outputs: StringDictionary[Exports]
}
object Metafile {
  
  inline def apply(inputs: StringDictionary[Imports], outputs: StringDictionary[Exports]): Metafile = {
    val __obj = js.Dynamic.literal(inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metafile]
  }
  
  extension [Self <: Metafile](x: Self) {
    
    inline def setInputs(value: StringDictionary[Imports]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: StringDictionary[Exports]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
  }
}
