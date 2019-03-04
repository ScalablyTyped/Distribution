package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesResource extends js.Object {
  /** Deletes the specified image. */
  def delete(request: gapiDotClientDotComputeLib.Anon_AltFieldsImage): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Sets the deprecation status of an image.
    *
    * If an empty request body is given, clears the deprecation status instead.
    */
  def deprecate(request: gapiDotClientDotComputeLib.Anon_AltFieldsImage): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /** Returns the specified image. Get a list of available images by making a list() request. */
  def get(request: gapiDotClientDotComputeLib.Anon_AltFieldsImageKey): gapiDotClientLib.gapiNs.clientNs.Request[Image]
  /** Returns the latest image that is part of an image family and is not deprecated. */
  def getFromFamily(request: gapiDotClientDotComputeLib.Anon_AltFamily): gapiDotClientLib.gapiNs.clientNs.Request[Image]
  /** Creates an image in the specified project using the data included in the request. */
  def insert(request: gapiDotClientDotComputeLib.Anon_AltFieldsForceCreate): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
  /**
    * Retrieves the list of private images available to the specified project. Private images are images you create that belong to your project. This method
    * does not get any images that belong to other projects, including publicly-available images, like Debian 8. If you want to get a list of
    * publicly-available images, use this method to make a request to the respective image project, such as debian-cloud or windows-cloud.
    */
  def list(request: gapiDotClientDotComputeLib.Anon_Alt): gapiDotClientLib.gapiNs.clientNs.Request[ImageList]
  /** Sets the labels on an image. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserResource): gapiDotClientLib.gapiNs.clientNs.Request[Operation]
}

object ImagesResource {
  @scala.inline
  def apply(
    delete: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsImage, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    deprecate: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsImage, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    get: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsImageKey, 
      gapiDotClientLib.gapiNs.clientNs.Request[Image]
    ],
    getFromFamily: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFamily, 
      gapiDotClientLib.gapiNs.clientNs.Request[Image]
    ],
    insert: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsForceCreate, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ],
    list: js.Function1[
      gapiDotClientDotComputeLib.Anon_Alt, 
      gapiDotClientLib.gapiNs.clientNs.Request[ImageList]
    ],
    setLabels: js.Function1[
      gapiDotClientDotComputeLib.Anon_AltFieldsKeyOauthtokenPrettyPrintProjectQuotaUserResource, 
      gapiDotClientLib.gapiNs.clientNs.Request[Operation]
    ]
  ): ImagesResource = {
    val __obj = js.Dynamic.literal(delete = delete, deprecate = deprecate, get = get, getFromFamily = getFromFamily, insert = insert, list = list, setLabels = setLabels)
  
    __obj.asInstanceOf[ImagesResource]
  }
}

