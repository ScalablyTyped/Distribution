package typings
package dwtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Copied from lib.d.ts (Typescript)
  */
@js.native
trait Blob extends js.Object {
  val size: scala.Double = js.native
  val `type`: java.lang.String = js.native
  def msClose(): scala.Unit = js.native
  def msDetachStream(): js.Any = js.native
  def slice(): Blob = js.native
  def slice(start: scala.Double): Blob = js.native
  def slice(start: scala.Double, end: scala.Double): Blob = js.native
  def slice(start: scala.Double, end: scala.Double, contentType: java.lang.String): Blob = js.native
}

