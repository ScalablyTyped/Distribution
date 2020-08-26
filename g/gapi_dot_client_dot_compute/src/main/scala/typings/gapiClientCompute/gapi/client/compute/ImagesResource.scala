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

@js.native
trait ImagesResource extends js.Object {
  /** Deletes the specified image. */
  def delete(request: typings.gapiClientCompute.anon.Image): Request[Operation] = js.native
  /**
    * Sets the deprecation status of an image.
    *
    * If an empty request body is given, clears the deprecation status instead.
    */
  def deprecate(request: typings.gapiClientCompute.anon.Image): Request[Operation] = js.native
  /** Returns the specified image. Get a list of available images by making a list() request. */
  def get(request: FieldsImage): Request[Image] = js.native
  /** Returns the latest image that is part of an image family and is not deprecated. */
  def getFromFamily(request: Family): Request[Image] = js.native
  /** Creates an image in the specified project using the data included in the request. */
  def insert(request: ForceCreate): Request[Operation] = js.native
  /**
    * Retrieves the list of private images available to the specified project. Private images are images you create that belong to your project. This method
    * does not get any images that belong to other projects, including publicly-available images, like Debian 8. If you want to get a list of
    * publicly-available images, use this method to make a request to the respective image project, such as debian-cloud or windows-cloud.
    */
  def list(request: Alt): Request[ImageList] = js.native
  /** Sets the labels on an image. To learn more about labels, read the Labeling Resources documentation. */
  def setLabels(request: KeyOauthtoken): Request[Operation] = js.native
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
  @scala.inline
  implicit class ImagesResourceOps[Self <: ImagesResource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDelete(value: typings.gapiClientCompute.anon.Image => Request[Operation]): Self = this.set("delete", js.Any.fromFunction1(value))
    @scala.inline
    def setDeprecate(value: typings.gapiClientCompute.anon.Image => Request[Operation]): Self = this.set("deprecate", js.Any.fromFunction1(value))
    @scala.inline
    def setGet(value: FieldsImage => Request[Image]): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setGetFromFamily(value: Family => Request[Image]): Self = this.set("getFromFamily", js.Any.fromFunction1(value))
    @scala.inline
    def setInsert(value: ForceCreate => Request[Operation]): Self = this.set("insert", js.Any.fromFunction1(value))
    @scala.inline
    def setList(value: Alt => Request[ImageList]): Self = this.set("list", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLabels(value: KeyOauthtoken => Request[Operation]): Self = this.set("setLabels", js.Any.fromFunction1(value))
  }
  
}

