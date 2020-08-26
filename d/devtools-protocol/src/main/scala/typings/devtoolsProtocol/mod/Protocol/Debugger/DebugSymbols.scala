package typings.devtoolsProtocol.mod.Protocol.Debugger

import typings.devtoolsProtocol.devtoolsProtocolStrings.EmbeddedDWARF
import typings.devtoolsProtocol.devtoolsProtocolStrings.ExternalDWARF
import typings.devtoolsProtocol.devtoolsProtocolStrings.None
import typings.devtoolsProtocol.devtoolsProtocolStrings.SourceMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DebugSymbols extends js.Object {
  /**
    * URL of the external symbol source.
    */
  var externalURL: js.UndefOr[String] = js.native
  /**
    * Type of the debug symbols. (DebugSymbolsType enum)
    */
  var `type`: None | SourceMap | EmbeddedDWARF | ExternalDWARF = js.native
}

object DebugSymbols {
  @scala.inline
  def apply(`type`: None | SourceMap | EmbeddedDWARF | ExternalDWARF): DebugSymbols = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DebugSymbols]
  }
  @scala.inline
  implicit class DebugSymbolsOps[Self <: DebugSymbols] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setType(value: None | SourceMap | EmbeddedDWARF | ExternalDWARF): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setExternalURL(value: String): Self = this.set("externalURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExternalURL: Self = this.set("externalURL", js.undefined)
  }
  
}

