package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicensesResource extends js.Object {
  /** Returns the specified License resource. */
  def get(request: typings.gapiClientCompute.anon.License): Request[License]
}

object LicensesResource {
  @scala.inline
  def apply(get: typings.gapiClientCompute.anon.License => Request[License]): LicensesResource = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[LicensesResource]
  }
}

