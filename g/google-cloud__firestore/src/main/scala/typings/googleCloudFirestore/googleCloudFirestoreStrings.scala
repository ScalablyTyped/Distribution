package typings.googleCloudFirestore

import typings.googleCloudFirestore.FirebaseFirestore.DocumentChangeType
import typings.googleCloudFirestore.FirebaseFirestore.OrderByDirection
import typings.googleCloudFirestore.FirebaseFirestore.WhereFilterOp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object googleCloudFirestoreStrings {
  @js.native
  sealed trait EqualssignEqualssign extends WhereFilterOp
  
  @js.native
  sealed trait Greaterthansign extends WhereFilterOp
  
  @js.native
  sealed trait GreaterthansignEqualssign extends WhereFilterOp
  
  @js.native
  sealed trait Lessthansign extends WhereFilterOp
  
  @js.native
  sealed trait LessthansignEqualssign extends WhereFilterOp
  
  @js.native
  sealed trait added extends DocumentChangeType
  
  @js.native
  sealed trait `array-contains` extends WhereFilterOp
  
  @js.native
  sealed trait `array-contains-any` extends WhereFilterOp
  
  @js.native
  sealed trait asc extends OrderByDirection
  
  @js.native
  sealed trait desc extends OrderByDirection
  
  @js.native
  sealed trait in extends WhereFilterOp
  
  @js.native
  sealed trait modified extends DocumentChangeType
  
  @js.native
  sealed trait removed extends DocumentChangeType
  
  @scala.inline
  def EqualssignEqualssign: EqualssignEqualssign = "==".asInstanceOf[EqualssignEqualssign]
  @scala.inline
  def Greaterthansign: Greaterthansign = ">".asInstanceOf[Greaterthansign]
  @scala.inline
  def GreaterthansignEqualssign: GreaterthansignEqualssign = ">=".asInstanceOf[GreaterthansignEqualssign]
  @scala.inline
  def Lessthansign: Lessthansign = "<".asInstanceOf[Lessthansign]
  @scala.inline
  def LessthansignEqualssign: LessthansignEqualssign = "<=".asInstanceOf[LessthansignEqualssign]
  @scala.inline
  def added: added = "added".asInstanceOf[added]
  @scala.inline
  def `array-contains`: `array-contains` = "array-contains".asInstanceOf[`array-contains`]
  @scala.inline
  def `array-contains-any`: `array-contains-any` = "array-contains-any".asInstanceOf[`array-contains-any`]
  @scala.inline
  def asc: asc = "asc".asInstanceOf[asc]
  @scala.inline
  def desc: desc = "desc".asInstanceOf[desc]
  @scala.inline
  def in: in = "in".asInstanceOf[in]
  @scala.inline
  def modified: modified = "modified".asInstanceOf[modified]
  @scala.inline
  def removed: removed = "removed".asInstanceOf[removed]
}

