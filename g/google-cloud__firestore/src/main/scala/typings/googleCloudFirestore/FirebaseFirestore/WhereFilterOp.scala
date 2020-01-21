package typings.googleCloudFirestore.FirebaseFirestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleCloudFirestore.googleCloudFirestoreStrings.Lessthansign
  - typings.googleCloudFirestore.googleCloudFirestoreStrings.LessthansignEqualssign
  - typings.googleCloudFirestore.googleCloudFirestoreStrings.EqualssignEqualssign
  - typings.googleCloudFirestore.googleCloudFirestoreStrings.GreaterthansignEqualssign
  - typings.googleCloudFirestore.googleCloudFirestoreStrings.Greaterthansign
  - typings.googleCloudFirestore.googleCloudFirestoreStrings.`array-contains`
  - typings.googleCloudFirestore.googleCloudFirestoreStrings.in
  - typings.googleCloudFirestore.googleCloudFirestoreStrings.`array-contains-any`
*/
trait WhereFilterOp extends js.Object

object WhereFilterOp {
  @scala.inline
  def EqualssignEqualssign: typings.googleCloudFirestore.googleCloudFirestoreStrings.EqualssignEqualssign = this.cast("==")
  @scala.inline
  def Greaterthansign: typings.googleCloudFirestore.googleCloudFirestoreStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typings.googleCloudFirestore.googleCloudFirestoreStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typings.googleCloudFirestore.googleCloudFirestoreStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typings.googleCloudFirestore.googleCloudFirestoreStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  def `array-contains`: typings.googleCloudFirestore.googleCloudFirestoreStrings.`array-contains` = this.cast("array-contains")
  @scala.inline
  def `array-contains-any`: typings.googleCloudFirestore.googleCloudFirestoreStrings.`array-contains-any` = this.cast("array-contains-any")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def in: typings.googleCloudFirestore.googleCloudFirestoreStrings.in = this.cast("in")
}

