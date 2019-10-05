package typings.dojo.dojox.uuid._base

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
    val __obj = js.Dynamic.literal(DCE_SECURITY = DCE_SECURITY, NAME_BASED_MD5 = NAME_BASED_MD5, NAME_BASED_SHA1 = NAME_BASED_SHA1, RANDOM = RANDOM, TIME_BASED = TIME_BASED, UNKNOWN = UNKNOWN)
  
    __obj.asInstanceOf[version]
  }
}

