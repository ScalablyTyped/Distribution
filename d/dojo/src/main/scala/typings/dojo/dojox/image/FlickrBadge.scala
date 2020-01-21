package typings.dojo.dojox.image

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/image/FlickrBadge.html
  *
  *
  */
@JSGlobal("dojox.image.FlickrBadge")
@js.native
class FlickrBadge () extends js.Object {
  /**
    *
    */
  var apikey: String = js.native
  /**
    *
    */
  var children: String = js.native
  /**
    * Free text search.  Photos who's title, description, or tags contain the text will be displayed
    *
    */
  var searchText: String = js.native
  /**
    * The id of the set to display
    *
    */
  var setid: String = js.native
  /**
    * A comma separated list of tags or an array of tags to grab from Flickr
    *
    */
  var tags: String = js.native
  /**
    * Where to display the pictures when clicked on.  Valid values are the same as the target attribute
    * of the A tag.
    *
    */
  var target: String = js.native
  /**
    * If you know your Flickr userid, you can set it to prevent a call to fetch the id
    *
    */
  var userid: String = js.native
  /**
    * Your Flickr username
    *
    */
  var username: String = js.native
  /**
    *
    */
  def postCreate(): Unit = js.native
  /**
    *
    */
  def startup(): Unit = js.native
}

