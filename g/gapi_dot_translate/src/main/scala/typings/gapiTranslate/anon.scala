package typings.gapiTranslate

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Cid extends StObject {
    
    /**
      * The customization id for translate
      */
    var cid: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Selector specifying which fields to include in a partial response.
      */
    var fields: js.UndefOr[String] = js.undefined
    
    /**
      * This optional parameter allows you to indicate that the text to be translated is either plain-text or HTML. A value of html indicates HTML and a value of text indicates plain-text
      */
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * If prettyprint=true, the results returned by the server will be human readable (pretty printed).
      */
    var prettyprint: js.UndefOr[String] = js.undefined
    
    /**
      *  The text to translate
      */
    var q: js.Array[String]
    
    /**
      * The source language of the text
      */
    var source: js.UndefOr[String] = js.undefined
    
    /**
      * The target language into which the text should be translated
      */
    var target: String
  }
  object Cid {
    
    inline def apply(q: js.Array[String], target: String): Cid = {
      val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cid]
    }
    
    extension [Self <: Cid](x: Self) {
      
      inline def setCid(value: js.Array[String]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      inline def setCidVarargs(value: String*): Self = StObject.set(x, "cid", js.Array(value :_*))
      
      inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setPrettyprint(value: String): Self = StObject.set(x, "prettyprint", value.asInstanceOf[js.Any])
      
      inline def setPrettyprintUndefined: Self = StObject.set(x, "prettyprint", js.undefined)
      
      inline def setQ(value: js.Array[String]): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      inline def setQVarargs(value: String*): Self = StObject.set(x, "q", js.Array(value :_*))
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait Confidence extends StObject {
    
    var confidence: Double
    
    var language: String
  }
  object Confidence {
    
    inline def apply(confidence: Double, language: String): Confidence = {
      val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[Confidence]
    }
    
    extension [Self <: Confidence](x: Self) {
      
      inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    }
  }
  
  trait DetectedSourceLanguage extends StObject {
    
    var detectedSourceLanguage: String
    
    var translatedText: String
  }
  object DetectedSourceLanguage {
    
    inline def apply(detectedSourceLanguage: String, translatedText: String): DetectedSourceLanguage = {
      val __obj = js.Dynamic.literal(detectedSourceLanguage = detectedSourceLanguage.asInstanceOf[js.Any], translatedText = translatedText.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetectedSourceLanguage]
    }
    
    extension [Self <: DetectedSourceLanguage](x: Self) {
      
      inline def setDetectedSourceLanguage(value: String): Self = StObject.set(x, "detectedSourceLanguage", value.asInstanceOf[js.Any])
      
      inline def setTranslatedText(value: String): Self = StObject.set(x, "translatedText", value.asInstanceOf[js.Any])
    }
  }
  
  trait Detections extends StObject {
    
    var detections: js.Array[js.Array[Confidence]]
  }
  object Detections {
    
    inline def apply(detections: js.Array[js.Array[Confidence]]): Detections = {
      val __obj = js.Dynamic.literal(detections = detections.asInstanceOf[js.Any])
      __obj.asInstanceOf[Detections]
    }
    
    extension [Self <: Detections](x: Self) {
      
      inline def setDetections(value: js.Array[js.Array[Confidence]]): Self = StObject.set(x, "detections", value.asInstanceOf[js.Any])
      
      inline def setDetectionsVarargs(value: js.Array[Confidence]*): Self = StObject.set(x, "detections", js.Array(value :_*))
    }
  }
  
  trait Fields extends StObject {
    
    /**
      * Selector specifying which fields to include in a partial response.
      */
    var fields: js.UndefOr[String] = js.undefined
    
    /**
      * The text to detect
      */
    var q: js.Array[String]
  }
  object Fields {
    
    inline def apply(q: js.Array[String]): Fields = {
      val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    extension [Self <: Fields](x: Self) {
      
      inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setQ(value: js.Array[String]): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      inline def setQVarargs(value: String*): Self = StObject.set(x, "q", js.Array(value :_*))
    }
  }
  
  trait Language extends StObject {
    
    var language: String
    
    var name: String
  }
  object Language {
    
    inline def apply(language: String, name: String): Language = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Language]
    }
    
    extension [Self <: Language](x: Self) {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Languages extends StObject {
    
    var languages: js.Array[Language]
  }
  object Languages {
    
    inline def apply(languages: js.Array[Language]): Languages = {
      val __obj = js.Dynamic.literal(languages = languages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Languages]
    }
    
    extension [Self <: Languages](x: Self) {
      
      inline def setLanguages(value: js.Array[Language]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      inline def setLanguagesVarargs(value: Language*): Self = StObject.set(x, "languages", js.Array(value :_*))
    }
  }
  
  trait Target extends StObject {
    
    /**
      * Selector specifying which fields to include in a partial response.
      */
    var fields: js.UndefOr[String] = js.undefined
    
    /**
      * the language and collation in which the localized results should be returned
      */
    var target: js.UndefOr[String] = js.undefined
  }
  object Target {
    
    inline def apply(): Target = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Target]
    }
    
    extension [Self <: Target](x: Self) {
      
      inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait Translations extends StObject {
    
    var translations: js.Array[DetectedSourceLanguage]
  }
  object Translations {
    
    inline def apply(translations: js.Array[DetectedSourceLanguage]): Translations = {
      val __obj = js.Dynamic.literal(translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Translations]
    }
    
    extension [Self <: Translations](x: Self) {
      
      inline def setTranslations(value: js.Array[DetectedSourceLanguage]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      inline def setTranslationsVarargs(value: DetectedSourceLanguage*): Self = StObject.set(x, "translations", js.Array(value :_*))
    }
  }
}
