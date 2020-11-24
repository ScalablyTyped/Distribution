package typings.dwt.addonPDFMod

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPDFCompressionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PDFWSetting extends js.Object {
  
  /**
    * Specify the author.
    */
  var author: String = js.native
  
  /**
    * Specify the compression type.
    */
  var compression: EnumDWTPDFCompressionType | Double = js.native
  
  /**
    * Specify the creation date.
    * Note that the argument should start with 'D:' like 'D:20181231'.
    */
  var creationDate: String = js.native
  
  /**
    * Specify the creator.
    */
  var creator: String = js.native
  
  /**
    * Specify the key words.
    */
  var keyWords: String = js.native
  
  /**
    * Specify the modified date.
    * Note that the argument should start with 'D:' like 'D:20181231'.
    */
  var modifiedDate: String = js.native
  
  /**
    * Specify the producer.
    */
  var producer: String = js.native
  
  /**
    * Specify the quality of the images in the file.
    * The value ranges from 0 to 100.
    * Only valid when the {compression} is 'JPEG' or 'JPEG2000'.
    */
  var quality: Double = js.native
  
  /**
    * Specify the subject.
    */
  var subject: String = js.native
  
  /**
    * Specify the title.
    */
  var title: String = js.native
  
  /**
    * Specify the PDF version. For example, '1.5'.
    */
  var version: String = js.native
}
object PDFWSetting {
  
  @scala.inline
  def apply(
    author: String,
    compression: EnumDWTPDFCompressionType | Double,
    creationDate: String,
    creator: String,
    keyWords: String,
    modifiedDate: String,
    producer: String,
    quality: Double,
    subject: String,
    title: String,
    version: String
  ): PDFWSetting = {
    val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], creationDate = creationDate.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], keyWords = keyWords.asInstanceOf[js.Any], modifiedDate = modifiedDate.asInstanceOf[js.Any], producer = producer.asInstanceOf[js.Any], quality = quality.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFWSetting]
  }
  
  @scala.inline
  implicit class PDFWSettingOps[Self <: PDFWSetting] (val x: Self) extends AnyVal {
    
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
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompression(value: EnumDWTPDFCompressionType | Double): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDate(value: String): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: String): Self = this.set("creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyWords(value: String): Self = this.set("keyWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModifiedDate(value: String): Self = this.set("modifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducer(value: String): Self = this.set("producer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
