package typings.dojo.dojox.uuid.base

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/uuid/_base.version.html
  *
  *
  */
trait version extends js.Object {
  /**
    *
    */
  var DCE_SECURITY: Double
  /**
    *
    */
  var NAME_BASED_MD5: Double
  /**
    *
    */
  var NAME_BASED_SHA1: Double
  /**
    *
    */
  var RANDOM: Double
  /**
    *
    */
  var TIME_BASED: Double
  /**
    *
    */
  var UNKNOWN: Double
}

object version {
  @scala.inline
  def apply(
    DCE_SECURITY: Double,
    NAME_BASED_MD5: Double,
    NAME_BASED_SHA1: Double,
    RANDOM: Double,
    TIME_BASED: Double,
    UNKNOWN: Double
  ): version = {
    val __obj = js.Dynamic.literal(DCE_SECURITY = DCE_SECURITY.asInstanceOf[js.Any], NAME_BASED_MD5 = NAME_BASED_MD5.asInstanceOf[js.Any], NAME_BASED_SHA1 = NAME_BASED_SHA1.asInstanceOf[js.Any], RANDOM = RANDOM.asInstanceOf[js.Any], TIME_BASED = TIME_BASED.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[version]
  }
}

