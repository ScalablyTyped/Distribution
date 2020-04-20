package typings.dojo.dojo.base.kernel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/_base/kernel.version.html
  *
  * Version number of the Dojo Toolkit
  * Hash about the version, including
  *
  * major: Integer: Major version. If total version is "1.2.0beta1", will be 1
  * minor: Integer: Minor version. If total version is "1.2.0beta1", will be 2
  * patch: Integer: Patch version. If total version is "1.2.0beta1", will be 0
  * flag: String: Descriptor flag. If total version is "1.2.0beta1", will be "beta1"
  * revision: Number: The Git rev from which dojo was pulled
  *
  */
trait version extends js.Object {
  /**
    *
    */
  var flag: String
  /**
    *
    */
  var major: Double
  /**
    *
    */
  var minor: Double
  /**
    *
    */
  var patch: Double
  /**
    *
    */
  var revision: Double
}

object version {
  @scala.inline
  def apply(flag: String, major: Double, minor: Double, patch: Double, revision: Double): version = {
    val __obj = js.Dynamic.literal(flag = flag.asInstanceOf[js.Any], major = major.asInstanceOf[js.Any], minor = minor.asInstanceOf[js.Any], patch = patch.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[version]
  }
}

