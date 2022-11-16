package typings.fflate.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type Zippable = {[path: string] : fflate.fflate.ZippableFile}
}}}
to avoid circular code involving: 
- fflate.fflate.Zippable
- fflate.fflate.ZippableFile
*/
trait Zippable
  extends StObject
     with /* path */ StringDictionary[ZippableFile]
object Zippable {
  
  inline def apply(): Zippable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Zippable]
  }
}
