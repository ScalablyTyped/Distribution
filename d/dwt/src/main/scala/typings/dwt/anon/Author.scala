package typings.dwt.anon

import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTPDFCompressionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Author extends StObject {
  
  var author: js.UndefOr[String] = js.undefined
  
  var compression: js.UndefOr[EnumDWTPDFCompressionType | Double] = js.undefined
  
  /**
    * Example: 'D:20181231'
    */
  var creationDate: js.UndefOr[String] = js.undefined
  
  var creator: js.UndefOr[String] = js.undefined
  
  var keyWords: js.UndefOr[String] = js.undefined
  
  /**
    * Example: 'D:20181231'
    */
  var modifiedDate: js.UndefOr[String] = js.undefined
  
  var producer: js.UndefOr[String] = js.undefined
  
  var quality: js.UndefOr[Double] = js.undefined
  
  var subject: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var version: js.UndefOr[Double] = js.undefined
}
object Author {
  
  inline def apply(): Author = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Author]
  }
  
  extension [Self <: Author](x: Self) {
    
    inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
    
    inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
    
    inline def setCompression(value: EnumDWTPDFCompressionType | Double): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    inline def setCreationDate(value: String): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setCreatorUndefined: Self = StObject.set(x, "creator", js.undefined)
    
    inline def setKeyWords(value: String): Self = StObject.set(x, "keyWords", value.asInstanceOf[js.Any])
    
    inline def setKeyWordsUndefined: Self = StObject.set(x, "keyWords", js.undefined)
    
    inline def setModifiedDate(value: String): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
    
    inline def setModifiedDateUndefined: Self = StObject.set(x, "modifiedDate", js.undefined)
    
    inline def setProducer(value: String): Self = StObject.set(x, "producer", value.asInstanceOf[js.Any])
    
    inline def setProducerUndefined: Self = StObject.set(x, "producer", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
