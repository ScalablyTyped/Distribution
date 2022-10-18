package typings.firebaseFirestore.distLiteInternalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A dot-separated path for navigating sub-objects within a document.
  * @internal
  */
@js.native
trait FieldPath2
  extends StObject
     with BasePath[FieldPath2] {
  
  def canonicalString(): String = js.native
  
  /**
    * Returns true if this field references the key of a document.
    */
  def isKeyField(): Boolean = js.native
}
