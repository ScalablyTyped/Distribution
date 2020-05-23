package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request
import typings.gapiClientCompute.anon.Alt
import typings.gapiClientCompute.anon.Family
import typings.gapiClientCompute.anon.FieldsImage
import typings.gapiClientCompute.anon.ForceCreate
import typings.gapiClientCompute.anon.KeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesResource extends js.Object {
  /** Deletes the specified image. */
  def delete(request: typings.gapiClientCompute.anon.Image): Request[Operation]
  /**
    * Sets the deprecation status of an image.
    *
    * If an empty request body is given, clears the deprecation status instead.
    */
  def deprecate(request: typings.gapiClientCompute.anon.Image): Request[Operation]
  /** Returns the specified image. Get a list of available images by making a list() request. */
  def get(request: FieldsImage): Request[Image]
  /** Returns the latest image that is part of an image family and is not deprecated. */
  def getFromFamily(request: Family): Request[Image]
  /** Creates an image in the specified project using the data included in the request. */
  def insert(request: ForceCreate): Request[Operation]
  /**
    * Retrieves the list of private images available to the specified project. Private images are images you create that belong to your project. This method
    * does not get any images that belong to other projects, including publicly-available images, like Debian 8. If you want to get a list of
    * publicly-available images, use this method to make a request to the respective image project, such as debian-cloud or windows-cloud.
    */
  def list(request: Alt): Request[ImageList]
  /** Sets the labels on an image. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: KeyOauthtoken): Request[Operation]
}

object ImagesResource {
  @scala.inline
  def apply(
    delete: typings.gapiClientCompute.anon.Image => Request[Operation],
    deprecate: typings.gapiClientCompute.anon.Image => Request[Operation],
    get: FieldsImage => Request[Image],
    getFromFamily: Family => Request[Image],
    insert: ForceCreate => Request[Operation],
    list: Alt => Request[ImageList],
    setLabels: KeyOauthtoken => Request[Operation]
  ): ImagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), deprecate = js.Any.fromFunction1(deprecate), get = js.Any.fromFunction1(get), getFromFamily = js.Any.fromFunction1(getFromFamily), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setLabels = js.Any.fromFunction1(setLabels))
    __obj.asInstanceOf[ImagesResource]
  }
}

