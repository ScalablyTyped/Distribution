package typings.emscripten.FS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FS.createPreloadedFile")
@js.native
object createPreloadedFile extends js.Object {
  def apply(parent: String, name: String, url: String, canRead: Boolean, canWrite: Boolean): Unit = js.native
  def apply(
    parent: String,
    name: String,
    url: String,
    canRead: Boolean,
    canWrite: Boolean,
    onload: js.Function0[Unit]
  ): Unit = js.native
  def apply(
    parent: String,
    name: String,
    url: String,
    canRead: Boolean,
    canWrite: Boolean,
    onload: js.Function0[Unit],
    onerror: js.Function0[Unit]
  ): Unit = js.native
  def apply(
    parent: String,
    name: String,
    url: String,
    canRead: Boolean,
    canWrite: Boolean,
    onload: js.Function0[Unit],
    onerror: js.Function0[Unit],
    dontCreateFile: Boolean
  ): Unit = js.native
  def apply(
    parent: String,
    name: String,
    url: String,
    canRead: Boolean,
    canWrite: Boolean,
    onload: js.Function0[Unit],
    onerror: js.Function0[Unit],
    dontCreateFile: Boolean,
    canOwn: Boolean
  ): Unit = js.native
  def apply(parent: FSNode, name: String, url: String, canRead: Boolean, canWrite: Boolean): Unit = js.native
  def apply(
    parent: FSNode,
    name: String,
    url: String,
    canRead: Boolean,
    canWrite: Boolean,
    onload: js.Function0[Unit]
  ): Unit = js.native
  def apply(
    parent: FSNode,
    name: String,
    url: String,
    canRead: Boolean,
    canWrite: Boolean,
    onload: js.Function0[Unit],
    onerror: js.Function0[Unit]
  ): Unit = js.native
  def apply(
    parent: FSNode,
    name: String,
    url: String,
    canRead: Boolean,
    canWrite: Boolean,
    onload: js.Function0[Unit],
    onerror: js.Function0[Unit],
    dontCreateFile: Boolean
  ): Unit = js.native
  def apply(
    parent: FSNode,
    name: String,
    url: String,
    canRead: Boolean,
    canWrite: Boolean,
    onload: js.Function0[Unit],
    onerror: js.Function0[Unit],
    dontCreateFile: Boolean,
    canOwn: Boolean
  ): Unit = js.native
}

