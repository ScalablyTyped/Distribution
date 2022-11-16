package typings.fflate.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type AsyncZippable = {[path: string] : fflate.fflate.AsyncZippableFile}
}}}
to avoid circular code involving: 
- fflate.fflate.AsyncZippable
- fflate.fflate.AsyncZippableFile
*/
trait AsyncZippable
  extends StObject
     with /* path */ StringDictionary[AsyncZippableFile]
object AsyncZippable {
  
  inline def apply(): AsyncZippable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncZippable]
  }
}
