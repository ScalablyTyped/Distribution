package typings.firebaseAuth.distEsm2017SrcModelPublicTypesMod

import typings.firebaseAuth.firebaseAuthStrings.LOCAL
import typings.firebaseAuth.firebaseAuthStrings.NONE
import typings.firebaseAuth.firebaseAuthStrings.SESSION
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Persistence extends StObject {
  
  /**
    * Type of Persistence.
    * - 'SESSION' is used for temporary persistence such as `sessionStorage`.
    * - 'LOCAL' is used for long term persistence such as `localStorage` or `IndexedDB`.
    * - 'NONE' is used for in-memory, or no persistence.
    */
  val `type`: SESSION | LOCAL | NONE
}
object Persistence {
  
  inline def apply(`type`: SESSION | LOCAL | NONE): Persistence = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Persistence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Persistence] (val x: Self) extends AnyVal {
    
    inline def setType(value: SESSION | LOCAL | NONE): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
