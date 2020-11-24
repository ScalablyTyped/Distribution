package typings.devtoolsProtocol.mod.Protocol.Tracing

import typings.devtoolsProtocol.devtoolsProtocolStrings.echoToConsole
import typings.devtoolsProtocol.devtoolsProtocolStrings.recordAsMuchAsPossible
import typings.devtoolsProtocol.devtoolsProtocolStrings.recordContinuously
import typings.devtoolsProtocol.devtoolsProtocolStrings.recordUntilFull
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraceConfig extends js.Object {
  
  /**
    * Turns on argument filter.
    */
  var enableArgumentFilter: js.UndefOr[Boolean] = js.native
  
  /**
    * Turns on JavaScript stack sampling.
    */
  var enableSampling: js.UndefOr[Boolean] = js.native
  
  /**
    * Turns on system tracing.
    */
  var enableSystrace: js.UndefOr[Boolean] = js.native
  
  /**
    * Excluded category filters.
    */
  var excludedCategories: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Included category filters.
    */
  var includedCategories: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Configuration for memory dump triggers. Used only when "memory-infra" category is enabled.
    */
  var memoryDumpConfig: js.UndefOr[MemoryDumpConfig] = js.native
  
  /**
    * Controls how the trace buffer stores data. (TraceConfigRecordMode enum)
    */
  var recordMode: js.UndefOr[recordUntilFull | recordContinuously | recordAsMuchAsPossible | echoToConsole] = js.native
  
  /**
    * Configuration to synthesize the delays in tracing.
    */
  var syntheticDelays: js.UndefOr[js.Array[String]] = js.native
}
object TraceConfig {
  
  @scala.inline
  def apply(): TraceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceConfig]
  }
  
  @scala.inline
  implicit class TraceConfigOps[Self <: TraceConfig] (val x: Self) extends AnyVal {
    
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
    def setEnableArgumentFilter(value: Boolean): Self = this.set("enableArgumentFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableArgumentFilter: Self = this.set("enableArgumentFilter", js.undefined)
    
    @scala.inline
    def setEnableSampling(value: Boolean): Self = this.set("enableSampling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSampling: Self = this.set("enableSampling", js.undefined)
    
    @scala.inline
    def setEnableSystrace(value: Boolean): Self = this.set("enableSystrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSystrace: Self = this.set("enableSystrace", js.undefined)
    
    @scala.inline
    def setExcludedCategoriesVarargs(value: String*): Self = this.set("excludedCategories", js.Array(value :_*))
    
    @scala.inline
    def setExcludedCategories(value: js.Array[String]): Self = this.set("excludedCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExcludedCategories: Self = this.set("excludedCategories", js.undefined)
    
    @scala.inline
    def setIncludedCategoriesVarargs(value: String*): Self = this.set("includedCategories", js.Array(value :_*))
    
    @scala.inline
    def setIncludedCategories(value: js.Array[String]): Self = this.set("includedCategories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludedCategories: Self = this.set("includedCategories", js.undefined)
    
    @scala.inline
    def setMemoryDumpConfig(value: MemoryDumpConfig): Self = this.set("memoryDumpConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMemoryDumpConfig: Self = this.set("memoryDumpConfig", js.undefined)
    
    @scala.inline
    def setRecordMode(value: recordUntilFull | recordContinuously | recordAsMuchAsPossible | echoToConsole): Self = this.set("recordMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRecordMode: Self = this.set("recordMode", js.undefined)
    
    @scala.inline
    def setSyntheticDelaysVarargs(value: String*): Self = this.set("syntheticDelays", js.Array(value :_*))
    
    @scala.inline
    def setSyntheticDelays(value: js.Array[String]): Self = this.set("syntheticDelays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSyntheticDelays: Self = this.set("syntheticDelays", js.undefined)
  }
}
