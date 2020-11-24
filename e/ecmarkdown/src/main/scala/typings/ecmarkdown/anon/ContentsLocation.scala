package typings.ecmarkdown.anon

import typings.ecmarkdown.ecmarkdownStrings.star
import typings.ecmarkdown.ecmarkdownStrings.tick
import typings.ecmarkdown.ecmarkdownStrings.tilde
import typings.ecmarkdown.ecmarkdownStrings.underscore
import typings.ecmarkdown.nodeTypesMod.CommentNode
import typings.ecmarkdown.nodeTypesMod.LocationRange
import typings.ecmarkdown.nodeTypesMod.TagNode
import typings.ecmarkdown.nodeTypesMod.TextNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContentsLocation extends js.Object {
  
  var contents: js.Array[TagNode | CommentNode | TextNode] = js.native
  
  var location: LocationRange = js.native
  
  var name: star | underscore | tick | tilde = js.native
}
object ContentsLocation {
  
  @scala.inline
  def apply(
    contents: js.Array[TagNode | CommentNode | TextNode],
    location: LocationRange,
    name: star | underscore | tick | tilde
  ): ContentsLocation = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentsLocation]
  }
  
  @scala.inline
  implicit class ContentsLocationOps[Self <: ContentsLocation] (val x: Self) extends AnyVal {
    
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
    def setContentsVarargs(value: (TagNode | CommentNode | TextNode)*): Self = this.set("contents", js.Array(value :_*))
    
    @scala.inline
    def setContents(value: js.Array[TagNode | CommentNode | TextNode]): Self = this.set("contents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: LocationRange): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: star | underscore | tick | tilde): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
