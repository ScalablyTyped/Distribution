package typings.googleCloudDatastore.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.googleCloudDatastore.googleCloudDatastoreStrings.Lessthansign
  - typings.googleCloudDatastore.googleCloudDatastoreStrings.LessthansignEqualssign
  - typings.googleCloudDatastore.googleCloudDatastoreStrings.Equalssign
  - typings.googleCloudDatastore.googleCloudDatastoreStrings.GreaterthansignEqualssign
  - typings.googleCloudDatastore.googleCloudDatastoreStrings.Greaterthansign
*/
trait QueryFilterOperator extends js.Object

object QueryFilterOperator {
  @scala.inline
  def Equalssign: typings.googleCloudDatastore.googleCloudDatastoreStrings.Equalssign = this.cast("=")
  @scala.inline
  def Greaterthansign: typings.googleCloudDatastore.googleCloudDatastoreStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typings.googleCloudDatastore.googleCloudDatastoreStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typings.googleCloudDatastore.googleCloudDatastoreStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typings.googleCloudDatastore.googleCloudDatastoreStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

