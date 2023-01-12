package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libDataTransferMod {
  
  @JSImport("fbjs/lib/DataTransfer", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with DataTransfer {
    def this(data: Any) = this()
    
    /* CompleteClass */
    override def getCount(): Double | Null = js.native
    
    /**
      * Get files.
      */
    /* CompleteClass */
    override def getFiles(): js.Array[Any] = js.native
    
    /**
      * Get HTML paste data
      */
    /* CompleteClass */
    override def getHTML(): js.UndefOr[String | Null] = js.native
    
    /**
      * Get a link url.
      */
    /* CompleteClass */
    override def getLink(): js.UndefOr[String | Null] = js.native
    
    /**
      * Get raw text.
      */
    /* CompleteClass */
    override def getText(): js.UndefOr[String | Null] = js.native
    
    /**
      * Are there any files to fetch?
      */
    /* CompleteClass */
    override def hasFiles(): Boolean = js.native
    
    /**
      * Is this an image data transfer?
      */
    /* CompleteClass */
    override def isImage(): Boolean = js.native
    
    /**
      * Is this a link data transfer?
      */
    /* CompleteClass */
    override def isLink(): Boolean = js.native
    
    /**
      * Is this likely to be a rich text data transfer?
      */
    /* CompleteClass */
    override def isRichText(): Boolean = js.native
  }
  
  trait DataTransfer extends StObject {
    
    def getCount(): Double | Null
    
    /**
      * Get files.
      */
    def getFiles(): js.Array[Any]
    
    /**
      * Get HTML paste data
      */
    def getHTML(): js.UndefOr[String | Null]
    
    /**
      * Get a link url.
      */
    def getLink(): js.UndefOr[String | Null]
    
    /**
      * Get raw text.
      */
    def getText(): js.UndefOr[String | Null]
    
    /**
      * Are there any files to fetch?
      */
    def hasFiles(): Boolean
    
    /**
      * Is this an image data transfer?
      */
    def isImage(): Boolean
    
    /**
      * Is this a link data transfer?
      */
    def isLink(): Boolean
    
    /**
      * Is this likely to be a rich text data transfer?
      */
    def isRichText(): Boolean
  }
  object DataTransfer {
    
    inline def apply(
      getCount: () => Double | Null,
      getFiles: () => js.Array[Any],
      getHTML: () => js.UndefOr[String | Null],
      getLink: () => js.UndefOr[String | Null],
      getText: () => js.UndefOr[String | Null],
      hasFiles: () => Boolean,
      isImage: () => Boolean,
      isLink: () => Boolean,
      isRichText: () => Boolean
    ): DataTransfer = {
      val __obj = js.Dynamic.literal(getCount = js.Any.fromFunction0(getCount), getFiles = js.Any.fromFunction0(getFiles), getHTML = js.Any.fromFunction0(getHTML), getLink = js.Any.fromFunction0(getLink), getText = js.Any.fromFunction0(getText), hasFiles = js.Any.fromFunction0(hasFiles), isImage = js.Any.fromFunction0(isImage), isLink = js.Any.fromFunction0(isLink), isRichText = js.Any.fromFunction0(isRichText))
      __obj.asInstanceOf[DataTransfer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataTransfer] (val x: Self) extends AnyVal {
      
      inline def setGetCount(value: () => Double | Null): Self = StObject.set(x, "getCount", js.Any.fromFunction0(value))
      
      inline def setGetFiles(value: () => js.Array[Any]): Self = StObject.set(x, "getFiles", js.Any.fromFunction0(value))
      
      inline def setGetHTML(value: () => js.UndefOr[String | Null]): Self = StObject.set(x, "getHTML", js.Any.fromFunction0(value))
      
      inline def setGetLink(value: () => js.UndefOr[String | Null]): Self = StObject.set(x, "getLink", js.Any.fromFunction0(value))
      
      inline def setGetText(value: () => js.UndefOr[String | Null]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
      
      inline def setHasFiles(value: () => Boolean): Self = StObject.set(x, "hasFiles", js.Any.fromFunction0(value))
      
      inline def setIsImage(value: () => Boolean): Self = StObject.set(x, "isImage", js.Any.fromFunction0(value))
      
      inline def setIsLink(value: () => Boolean): Self = StObject.set(x, "isLink", js.Any.fromFunction0(value))
      
      inline def setIsRichText(value: () => Boolean): Self = StObject.set(x, "isRichText", js.Any.fromFunction0(value))
    }
  }
}
