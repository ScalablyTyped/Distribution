package typings
package gapiDotClientDotResourceviewsLib.gapiNs.clientNs.resourceviewsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ZoneViewsResource extends js.Object {
  /** Add resources to the view. */
  def addResources(request: gapiDotClientDotResourceviewsLib.Anon_ProjectPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Delete a resource view. */
  def delete(request: gapiDotClientDotResourceviewsLib.Anon_ProjectPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Get the information of a zonal resource view. */
  def get(request: gapiDotClientDotResourceviewsLib.Anon_ProjectPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[ResourceView]
  /** Get the service information of a resource view or a resource. */
  def getService(request: gapiDotClientDotResourceviewsLib.Anon_ProjectPrettyPrintQuotaUser): gapiDotClientLib.gapiNs.clientNs.Request[ZoneViewsGetServiceResponse]
  /** Create a resource view. */
  def insert(request: gapiDotClientDotResourceviewsLib.Anon_Project): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** List resource views. */
  def list(request: gapiDotClientDotResourceviewsLib.Anon_ProjectMaxResults): gapiDotClientLib.gapiNs.clientNs.Request[ZoneViewsList]
  /** List the resources of the resource view. */
  def listResources(request: gapiDotClientDotResourceviewsLib.Anon_Format): gapiDotClientLib.gapiNs.clientNs.Request[ZoneViewsListResourcesResponse]
  /** Remove resources from the view. */
  def removeResources(request: gapiDotClientDotResourceviewsLib.Anon_ProjectPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Update the service information of a resource view or a resource. */
  def setService(request: gapiDotClientDotResourceviewsLib.Anon_ProjectPrettyPrint): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

