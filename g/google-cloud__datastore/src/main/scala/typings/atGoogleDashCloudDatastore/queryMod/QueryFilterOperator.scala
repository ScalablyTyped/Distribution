package typings.atGoogleDashCloudDatastore.queryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.atGoogleDashCloudDatastore.atGoogleDashCloudDatastoreStrings.Lessthansign
  - typings.atGoogleDashCloudDatastore.atGoogleDashCloudDatastoreStrings.LessthansignEqualssign
  - typings.atGoogleDashCloudDatastore.atGoogleDashCloudDatastoreStrings.Equalssign
  - typings.atGoogleDashCloudDatastore.atGoogleDashCloudDatastoreStrings.GreaterthansignEqualssign
  - typings.atGoogleDashCloudDatastore.atGoogleDashCloudDatastoreStrings.Greaterthansign
*/
trait QueryFilterOperator extends js.Object

object QueryFilterOperator {
  @scala.inline
  def Equalssign: typings.atGoogleDashCloudDatastore.atGoogleDashCloudDatastoreStrings.Equalssign = this.cast("=")
  @scala.inline
  def Greaterthansign: typings.atGoogleDashCloudDatastore.atGoogleDashCloudDatastoreStrings.Greaterthansign = this.cast(">")
  @scala.inline
  def GreaterthansignEqualssign: typings.atGoogleDashCloudDatastore.atGoogleDashCloudDatastoreStrings.GreaterthansignEqualssign = this.cast(">=")
  @scala.inline
  def Lessthansign: typings.atGoogleDashCloudDatastore.atGoogleDashCloudDatastoreStrings.Lessthansign = this.cast("<")
  @scala.inline
  def LessthansignEqualssign: typings.atGoogleDashCloudDatastore.atGoogleDashCloudDatastoreStrings.LessthansignEqualssign = this.cast("<=")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

