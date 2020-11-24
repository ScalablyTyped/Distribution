package typings.gherkin.gherkinExeMod

import org.scalablytyped.runtime.StringDictionary
import typings.gherkin.dialectMod.Dialect
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GherkinExe extends js.Object {
  
  def dialects(): StringDictionary[Dialect] = js.native
  
  val envelopes: js.Any = js.native
  
  val gherkinExe: js.Any = js.native
  
  def messageStream(): Readable = js.native
  
  val options: js.Any = js.native
  
  val paths: js.Any = js.native
}
object GherkinExe {
  
  @scala.inline
  def apply(
    dialects: () => StringDictionary[Dialect],
    envelopes: js.Any,
    gherkinExe: js.Any,
    messageStream: () => Readable,
    options: js.Any,
    paths: js.Any
  ): GherkinExe = {
    val __obj = js.Dynamic.literal(dialects = js.Any.fromFunction0(dialects), envelopes = envelopes.asInstanceOf[js.Any], gherkinExe = gherkinExe.asInstanceOf[js.Any], messageStream = js.Any.fromFunction0(messageStream), options = options.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[GherkinExe]
  }
  
  @scala.inline
  implicit class GherkinExeOps[Self <: GherkinExe] (val x: Self) extends AnyVal {
    
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
    def setDialects(value: () => StringDictionary[Dialect]): Self = this.set("dialects", js.Any.fromFunction0(value))
    
    @scala.inline
    def setEnvelopes(value: js.Any): Self = this.set("envelopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGherkinExe(value: js.Any): Self = this.set("gherkinExe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageStream(value: () => Readable): Self = this.set("messageStream", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOptions(value: js.Any): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaths(value: js.Any): Self = this.set("paths", value.asInstanceOf[js.Any])
  }
}
