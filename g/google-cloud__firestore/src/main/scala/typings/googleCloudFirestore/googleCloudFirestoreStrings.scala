package typings.googleCloudFirestore

import typings.googleCloudFirestore.FirebaseFirestore.DocumentChangeType
import typings.googleCloudFirestore.FirebaseFirestore.OrderByDirection
import typings.googleCloudFirestore.FirebaseFirestore.WhereFilterOp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleCloudFirestoreStrings {
  
  @js.native
  sealed trait EqualssignEqualssign extends WhereFilterOp
  @scala.inline
  def EqualssignEqualssign: EqualssignEqualssign = "==".asInstanceOf[EqualssignEqualssign]
  
  @js.native
  sealed trait ExclamationmarkEqualssign extends WhereFilterOp
  @scala.inline
  def ExclamationmarkEqualssign: ExclamationmarkEqualssign = "!=".asInstanceOf[ExclamationmarkEqualssign]
  
  @js.native
  sealed trait Greaterthansign extends WhereFilterOp
  @scala.inline
  def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  
  @js.native
  sealed trait GreaterthansignEqualssign extends WhereFilterOp
  @scala.inline
  def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  
  @js.native
  sealed trait Lessthansign extends WhereFilterOp
  @scala.inline
  def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  
  @js.native
  sealed trait LessthansignEqualssign extends WhereFilterOp
  @scala.inline
  def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  
  @js.native
  sealed trait added extends DocumentChangeType
  @scala.inline
  def added: added = "added".asInstanceOf[added]
  
  @js.native
  sealed trait `array-contains` extends WhereFilterOp
  @scala.inline
  def `array-contains`: `array-contains` = "array-contains".asInstanceOf[`array-contains`]
  
  @js.native
  sealed trait `array-contains-any` extends WhereFilterOp
  @scala.inline
  def `array-contains-any`: `array-contains-any` = "array-contains-any".asInstanceOf[`array-contains-any`]
  
  @js.native
  sealed trait asc extends OrderByDirection
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  
  @js.native
  sealed trait create extends StObject
  @scala.inline
  def create: create = "create".asInstanceOf[create]
  
  @js.native
  sealed trait delete extends StObject
  @scala.inline
  def delete: delete = "delete".asInstanceOf[delete]
  
  @js.native
  sealed trait desc extends OrderByDirection
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  
  @js.native
  sealed trait in extends WhereFilterOp
  @scala.inline
  def in: in = "in".asInstanceOf[in]
  
  @js.native
  sealed trait modified extends DocumentChangeType
  @scala.inline
  def modified: modified = "modified".asInstanceOf[modified]
  
  @js.native
  sealed trait `not-in` extends WhereFilterOp
  @scala.inline
  def `not-in`: `not-in` = "not-in".asInstanceOf[`not-in`]
  
  @js.native
  sealed trait removed extends DocumentChangeType
  @scala.inline
  def removed: removed = "removed".asInstanceOf[removed]
  
  @js.native
  sealed trait set extends StObject
  @scala.inline
  def set: set = "set".asInstanceOf[set]
  
  @js.native
  sealed trait update extends StObject
  @scala.inline
  def update: update = "update".asInstanceOf[update]
}
