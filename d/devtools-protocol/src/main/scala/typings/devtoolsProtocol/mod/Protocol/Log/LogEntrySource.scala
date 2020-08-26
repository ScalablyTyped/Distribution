package typings.devtoolsProtocol.mod.Protocol.Log

import typings.devtoolsProtocol.devtoolsProtocolStrings.appcache
import typings.devtoolsProtocol.devtoolsProtocolStrings.deprecation
import typings.devtoolsProtocol.devtoolsProtocolStrings.intervention
import typings.devtoolsProtocol.devtoolsProtocolStrings.javascript_
import typings.devtoolsProtocol.devtoolsProtocolStrings.network
import typings.devtoolsProtocol.devtoolsProtocolStrings.other_
import typings.devtoolsProtocol.devtoolsProtocolStrings.recommendation
import typings.devtoolsProtocol.devtoolsProtocolStrings.rendering
import typings.devtoolsProtocol.devtoolsProtocolStrings.security
import typings.devtoolsProtocol.devtoolsProtocolStrings.storage
import typings.devtoolsProtocol.devtoolsProtocolStrings.violation
import typings.devtoolsProtocol.devtoolsProtocolStrings.worker_
import typings.devtoolsProtocol.devtoolsProtocolStrings.xml
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.devtoolsProtocol.devtoolsProtocolStrings.xml
  - typings.devtoolsProtocol.devtoolsProtocolStrings.javascript_
  - typings.devtoolsProtocol.devtoolsProtocolStrings.network
  - typings.devtoolsProtocol.devtoolsProtocolStrings.storage
  - typings.devtoolsProtocol.devtoolsProtocolStrings.appcache
  - typings.devtoolsProtocol.devtoolsProtocolStrings.rendering
  - typings.devtoolsProtocol.devtoolsProtocolStrings.security
  - typings.devtoolsProtocol.devtoolsProtocolStrings.deprecation
  - typings.devtoolsProtocol.devtoolsProtocolStrings.worker_
  - typings.devtoolsProtocol.devtoolsProtocolStrings.violation
  - typings.devtoolsProtocol.devtoolsProtocolStrings.intervention
  - typings.devtoolsProtocol.devtoolsProtocolStrings.recommendation
  - typings.devtoolsProtocol.devtoolsProtocolStrings.other_
*/
trait LogEntrySource extends js.Object

object LogEntrySource {
  @scala.inline
  def Appcache: appcache = "appcache".asInstanceOf[appcache]
  @scala.inline
  def Deprecation: deprecation = "deprecation".asInstanceOf[deprecation]
  @scala.inline
  def Intervention: intervention = "intervention".asInstanceOf[intervention]
  @scala.inline
  def Javascript: javascript_ = "javascript".asInstanceOf[javascript_]
  @scala.inline
  def Network: network = "network".asInstanceOf[network]
  @scala.inline
  def Other: other_ = "other".asInstanceOf[other_]
  @scala.inline
  def Recommendation: recommendation = "recommendation".asInstanceOf[recommendation]
  @scala.inline
  def Rendering: rendering = "rendering".asInstanceOf[rendering]
  @scala.inline
  def Security: security = "security".asInstanceOf[security]
  @scala.inline
  def Storage: storage = "storage".asInstanceOf[storage]
  @scala.inline
  def Violation: violation = "violation".asInstanceOf[violation]
  @scala.inline
  def Worker: worker_ = "worker".asInstanceOf[worker_]
  @scala.inline
  def XML: xml = "xml".asInstanceOf[xml]
}

