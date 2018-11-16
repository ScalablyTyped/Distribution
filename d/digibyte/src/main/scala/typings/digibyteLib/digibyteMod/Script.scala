package typings
package digibyteLib.digibyteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("digibyte", "Script")
@js.native
class Script protected () extends js.Object {
  def this(data: java.lang.String) = this()
  def this(data: js.Object) = this()
  def add(obj: js.Any): this.type = js.native
  def checkMinimalPush(i: scala.Double): scala.Boolean = js.native
  def classify(): java.lang.String = js.native
  def classifyInput(): java.lang.String = js.native
  def classifyOutput(): java.lang.String = js.native
  def equals(script: Script): scala.Boolean = js.native
  def findAndDelete(script: Script): this.type = js.native
  def getAddressInfo(): Address | scala.Boolean = js.native
  def getData(): nodeLib.Buffer = js.native
  def getPublicKey(): nodeLib.Buffer = js.native
  def getPublicKeyHash(): nodeLib.Buffer = js.native
  def getSignatureOperationsCount(accurate: scala.Boolean): scala.Double = js.native
  def hasCodeseparators(): scala.Boolean = js.native
  def isDataOut(): scala.Boolean = js.native
  def isMultisigIn(): scala.Boolean = js.native
  def isMultisigOut(): scala.Boolean = js.native
  def isPublicKeyHashIn(): scala.Boolean = js.native
  def isPublicKeyHashOut(): scala.Boolean = js.native
  def isPublicKeyIn(): scala.Boolean = js.native
  def isPublicKeyOut(): scala.Boolean = js.native
  def isPushOnly(): scala.Boolean = js.native
  def isScriptHashIn(): scala.Boolean = js.native
  def isScriptHashOut(): scala.Boolean = js.native
  def isStandard(): scala.Boolean = js.native
  def isWitnessProgram(): scala.Boolean = js.native
  def isWitnessPublicKeyHashOut(): scala.Boolean = js.native
  def isWitnessScriptHashOut(): scala.Boolean = js.native
  def prepend(obj: js.Any): this.type = js.native
  def removeCodeseparators(): this.type = js.native
  def set(obj: js.Object): this.type = js.native
  def toASM(): java.lang.String = js.native
  def toAddress(): Address = js.native
  def toBuffer(): nodeLib.Buffer = js.native
  def toHex(): java.lang.String = js.native
}

