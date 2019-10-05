package typings.dojo.dojo.main

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/main.version.html
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
  def apply(
    flag: String,
    major: Double,
    minor: Double,
    patch: Double,
    revision: Double,
    toString: () => String
  ): version = {
    val __obj = js.Dynamic.literal(flag = flag, major = major, minor = minor, patch = patch, revision = revision, toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[version]
  }
}

