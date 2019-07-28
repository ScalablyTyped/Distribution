package typings.dwt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Copied from lib.d.ts (Typescript)
  */
@js.native
trait Blob extends js.Object {
  val size: Double = js.native
  val `type`: String = js.native
  def msClose(): Unit = js.native
  def msDetachStream(): js.Any = js.native
  def slice(): Blob = js.native
  def slice(start: Double): Blob = js.native
  def slice(start: Double, end: Double): Blob = js.native
  def slice(start: Double, end: Double, contentType: String): Blob = js.native
}

