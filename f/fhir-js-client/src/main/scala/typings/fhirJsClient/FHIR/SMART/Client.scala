package typings.fhirJsClient.FHIR.SMART

import typings.fhirJsClient.anon.Any
import typings.std.Blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Client extends js.Object {
  /**
    * fhir.js FHIR API interface
    */
  var api: Api = js.native
  /**
    * Patient in context and interface to perform FHIR API calls within its context
    */
  var patient: js.UndefOr[Patient] = js.native
  /**
    * Current server, user and patient in context
    */
  var server: Context = js.native
  /**
    * Helper method to convert units
    */
  var units: Any = js.native
  /**
    * User in context and exposes a method 'read' to get information.
    */
  var user: User = js.native
  /**
    * Id of the user in context
    */
  var userId: js.UndefOr[String] = js.native
  def byCode(observations: js.Array[Resource], property: String): ObservationsByCode = js.native
  /**
    * Split a set of observations based on codable concept properties. eg. code
    * @param observations  Observation resources
    * @param property The name of the property which is a codable concept
    * Returns an object with code values as index and array of observations as values
    */
  def byCode(observations: Resource, property: String): ObservationsByCode = js.native
  def byCodes(observations: js.Array[Resource], property: String*): js.Function1[/* repeated */ String, js.Array[Resource]] = js.native
  /**
    * Split a set of observations based on codable concept properties. eg. code
    * @param observations  Observation resources
    * @param property  The name of the property which is a codable concept
    * Returns a function to which you can pass code values and get a filtered array of observations.
    */
  def byCodes(observations: Resource, property: String*): js.Function1[/* repeated */ String, js.Array[Resource]] = js.native
  /**
    * Fetch a resource as Binary/Blob
    * @param path Absolute or relative path to the resource to be fetched
    */
  def fetchBinary(path: String): js.Promise[Blob] = js.native
  /**
    * Get the resources based on the resource type and id
    * @param params Resource type and id
    */
  def get(params: ResourceParameter): js.Promise[Response] = js.native
  /**
    * Fetch a resource as Binary/Blob (Same as fetchBinary)
    * @param path Absolute url of the resource to be fetched
    */
  def getBinary(path: String): js.Promise[Blob] = js.native
}

