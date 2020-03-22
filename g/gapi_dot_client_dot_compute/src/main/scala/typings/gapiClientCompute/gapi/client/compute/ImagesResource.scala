package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonFamily
import typings.gapiClientCompute.AnonFieldsImage
import typings.gapiClientCompute.AnonForceCreate
import typings.gapiClientCompute.AnonImage
import typings.gapiClientCompute.AnonKeyOauthtoken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagesResource extends js.Object {
  /** Deletes the specified image. */
  def delete(request: AnonImage): Request_[Operation]
  /**
    * Sets the deprecation status of an image.
    *
    * If an empty request body is given, clears the deprecation status instead.
    */
  def deprecate(request: AnonImage): Request_[Operation]
  /** Returns the specified image. Get a list of available images by making a list() request. */
  def get(request: AnonFieldsImage): Request_[Image]
  /** Returns the latest image that is part of an image family and is not deprecated. */
  def getFromFamily(request: AnonFamily): Request_[Image]
  /** Creates an image in the specified project using the data included in the request. */
  def insert(request: AnonForceCreate): Request_[Operation]
  /**
    * Retrieves the list of private images available to the specified project. Private images are images you create that belong to your project. This method
    * does not get any images that belong to other projects, including publicly-available images, like Debian 8. If you want to get a list of
    * publicly-available images, use this method to make a request to the respective image project, such as debian-cloud or windows-cloud.
    */
  def list(request: AnonAlt): Request_[ImageList]
  /** Sets the labels on an image. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: AnonKeyOauthtoken): Request_[Operation]
}

object ImagesResource {
  @scala.inline
  def apply(
    delete: AnonImage => Request_[Operation],
    deprecate: AnonImage => Request_[Operation],
    get: AnonFieldsImage => Request_[Image],
    getFromFamily: AnonFamily => Request_[Image],
    insert: AnonForceCreate => Request_[Operation],
    list: AnonAlt => Request_[ImageList],
    setLabels: AnonKeyOauthtoken => Request_[Operation]
  ): ImagesResource = {
    val __obj = js.Dynamic.literal(delete = js.Any.fromFunction1(delete), deprecate = js.Any.fromFunction1(deprecate), get = js.Any.fromFunction1(get), getFromFamily = js.Any.fromFunction1(getFromFamily), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), setLabels = js.Any.fromFunction1(setLabels))
  
    __obj.asInstanceOf[ImagesResource]
  }
}

