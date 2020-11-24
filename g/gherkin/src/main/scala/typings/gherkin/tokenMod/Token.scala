package typings.gherkin.tokenMod

import typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages.ILocation
import typings.gherkin.parserMod.TokenType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Token extends js.Object {
  
  def detach(): Unit = js.native
  
  def getTokenValue(): String = js.native
  
  var isEof: Boolean = js.native
  
  val line: typings.gherkin.gherkinLineMod.default = js.native
  
  val location: ILocation = js.native
  
  var matchedGherkinDialect: String = js.native
  
  var matchedIndent: Double = js.native
  
  var matchedItems: js.Array[typings.gherkin.gherkinLineMod.default] = js.native
  
  var matchedKeyword: String = js.native
  
  var matchedText: js.UndefOr[String] = js.native
  
  var matchedType: TokenType = js.native
}
object Token {
  
  @scala.inline
  def apply(
    detach: () => Unit,
    getTokenValue: () => String,
    isEof: Boolean,
    line: typings.gherkin.gherkinLineMod.default,
    location: ILocation,
    matchedGherkinDialect: String,
    matchedIndent: Double,
    matchedItems: js.Array[typings.gherkin.gherkinLineMod.default],
    matchedKeyword: String,
    matchedType: TokenType
  ): Token = {
    val __obj = js.Dynamic.literal(detach = js.Any.fromFunction0(detach), getTokenValue = js.Any.fromFunction0(getTokenValue), isEof = isEof.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], matchedGherkinDialect = matchedGherkinDialect.asInstanceOf[js.Any], matchedIndent = matchedIndent.asInstanceOf[js.Any], matchedItems = matchedItems.asInstanceOf[js.Any], matchedKeyword = matchedKeyword.asInstanceOf[js.Any], matchedType = matchedType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  implicit class TokenOps[Self <: Token] (val x: Self) extends AnyVal {
    
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
    def setDetach(value: () => Unit): Self = this.set("detach", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTokenValue(value: () => String): Self = this.set("getTokenValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsEof(value: Boolean): Self = this.set("isEof", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine(value: typings.gherkin.gherkinLineMod.default): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: ILocation): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedGherkinDialect(value: String): Self = this.set("matchedGherkinDialect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedIndent(value: Double): Self = this.set("matchedIndent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedItemsVarargs(value: typings.gherkin.gherkinLineMod.default*): Self = this.set("matchedItems", js.Array(value :_*))
    
    @scala.inline
    def setMatchedItems(value: js.Array[typings.gherkin.gherkinLineMod.default]): Self = this.set("matchedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedKeyword(value: String): Self = this.set("matchedKeyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedType(value: TokenType): Self = this.set("matchedType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedText(value: String): Self = this.set("matchedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMatchedText: Self = this.set("matchedText", js.undefined)
  }
}
