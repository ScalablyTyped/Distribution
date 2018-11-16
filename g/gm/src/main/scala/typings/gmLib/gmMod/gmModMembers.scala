package typings
package gmLib.gmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("gm", JSImport.Namespace)
@js.native
object gmModMembers extends js.Object {
  def apply(stream: nodeLib.NodeJSNs.ReadableStream | nodeLib.Buffer | java.lang.String): gmLib.gmMod.mNs.State = js.native
  def apply(
    stream: nodeLib.NodeJSNs.ReadableStream | nodeLib.Buffer | java.lang.String,
    image: java.lang.String
  ): gmLib.gmMod.mNs.State = js.native
  def apply(width: scala.Double, height: scala.Double): gmLib.gmMod.mNs.State = js.native
  def apply(width: scala.Double, height: scala.Double, color: java.lang.String): gmLib.gmMod.mNs.State = js.native
  def compare(
    filename1: java.lang.String,
    filename2: java.lang.String,
    callback: gmLib.gmMod.mNs.CompareCallback
  ): scala.Unit = js.native
  def compare(
    filename1: java.lang.String,
    filename2: java.lang.String,
    options: gmLib.gmMod.mNs.CompareOptions,
    callback: gmLib.gmMod.mNs.CompareCallback
  ): scala.Unit = js.native
  def compare(
    filename1: java.lang.String,
    filename2: java.lang.String,
    options: scala.Double,
    callback: gmLib.gmMod.mNs.CompareCallback
  ): scala.Unit = js.native
  def subClass(options: gmLib.gmMod.mNs.ClassOptions): gmLib.gmMod.mNs.SubClass = js.native
}

