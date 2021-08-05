package typings.diff.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplyPatchesOptions
  extends StObject
     with ApplyPatchOptions {
  
  def complete(err: js.Any): Unit
  
  def loadFile(index: ParsedDiff, callback: js.Function2[/* err */ js.Any, /* data */ String, Unit]): Unit
  
  def patched(index: ParsedDiff, content: String, callback: js.Function1[/* err */ js.Any, Unit]): Unit
}
object ApplyPatchesOptions {
  
  inline def apply(
    complete: js.Any => Unit,
    loadFile: (ParsedDiff, js.Function2[/* err */ js.Any, /* data */ String, Unit]) => Unit,
    patched: (ParsedDiff, String, js.Function1[/* err */ js.Any, Unit]) => Unit
  ): ApplyPatchesOptions = {
    val __obj = js.Dynamic.literal(complete = js.Any.fromFunction1(complete), loadFile = js.Any.fromFunction2(loadFile), patched = js.Any.fromFunction3(patched))
    __obj.asInstanceOf[ApplyPatchesOptions]
  }
  
  extension [Self <: ApplyPatchesOptions](x: Self) {
    
    inline def setComplete(value: js.Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setLoadFile(value: (ParsedDiff, js.Function2[/* err */ js.Any, /* data */ String, Unit]) => Unit): Self = StObject.set(x, "loadFile", js.Any.fromFunction2(value))
    
    inline def setPatched(value: (ParsedDiff, String, js.Function1[/* err */ js.Any, Unit]) => Unit): Self = StObject.set(x, "patched", js.Any.fromFunction3(value))
  }
}
