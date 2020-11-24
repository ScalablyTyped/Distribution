package typings.devexpressUtils.sequenceComparisonStringMod

import typings.devexpressUtils.commonMod.ISequenceComparatorItertor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@devexpress/utils/lib/sequence-comparison/string", "StringSequenceComparatorItertor")
@js.native
class StringSequenceComparatorItertor protected () extends ISequenceComparatorItertor[String] {
  def this(str: String) = this()
  
  var str: String = js.native
}
