package typings.digibyte.digibyteMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("digibyte", "Script")
@js.native
class Script protected () extends js.Object {
  def this(data: String) = this()
  def this(data: js.Object) = this()
  def add(obj: js.Any): this.type = js.native
  def checkMinimalPush(i: Double): Boolean = js.native
  def classify(): String = js.native
  def classifyInput(): String = js.native
  def classifyOutput(): String = js.native
  def equals(script: Script): Boolean = js.native
  def findAndDelete(script: Script): this.type = js.native
  def getAddressInfo(): Address | Boolean = js.native
  def getData(): Buffer = js.native
  def getPublicKey(): Buffer = js.native
  def getPublicKeyHash(): Buffer = js.native
  def getSignatureOperationsCount(accurate: Boolean): Double = js.native
  def hasCodeseparators(): Boolean = js.native
  def isDataOut(): Boolean = js.native
  def isMultisigIn(): Boolean = js.native
  def isMultisigOut(): Boolean = js.native
  def isPublicKeyHashIn(): Boolean = js.native
  def isPublicKeyHashOut(): Boolean = js.native
  def isPublicKeyIn(): Boolean = js.native
  def isPublicKeyOut(): Boolean = js.native
  def isPushOnly(): Boolean = js.native
  def isScriptHashIn(): Boolean = js.native
  def isScriptHashOut(): Boolean = js.native
  def isStandard(): Boolean = js.native
  def isWitnessProgram(): Boolean = js.native
  def isWitnessPublicKeyHashOut(): Boolean = js.native
  def isWitnessScriptHashOut(): Boolean = js.native
  def prepend(obj: js.Any): this.type = js.native
  def removeCodeseparators(): this.type = js.native
  def set(obj: js.Object): this.type = js.native
  def toASM(): String = js.native
  def toAddress(): Address = js.native
  def toBuffer(): Buffer = js.native
  def toHex(): String = js.native
}

