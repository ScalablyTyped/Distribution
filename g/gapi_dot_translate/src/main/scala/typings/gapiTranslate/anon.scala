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
    
    @scala.inline
    def apply(q: js.Array[String], target: String): Cid = {
      val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Cid]
    }
    
    @scala.inline
    implicit class CidMutableBuilder[Self <: Cid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCid(value: js.Array[String]): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      @scala.inline
      def setCidVarargs(value: String*): Self = StObject.set(x, "cid", js.Array(value :_*))
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setPrettyprint(value: String): Self = StObject.set(x, "prettyprint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrettyprintUndefined: Self = StObject.set(x, "prettyprint", js.undefined)
      
      @scala.inline
      def setQ(value: js.Array[String]): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQVarargs(value: String*): Self = StObject.set(x, "q", js.Array(value :_*))
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait Confidence extends StObject {
    
    var confidence: Double
    
    var language: String
  }
  object Confidence {
    
    @scala.inline
    def apply(confidence: Double, language: String): Confidence = {
      val __obj = js.Dynamic.literal(confidence = confidence.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
      __obj.asInstanceOf[Confidence]
    }
    
    @scala.inline
    implicit class ConfidenceMutableBuilder[Self <: Confidence] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    }
  }
  
  trait DetectedSourceLanguage extends StObject {
    
    var detectedSourceLanguage: String
    
    var translatedText: String
  }
  object DetectedSourceLanguage {
    
    @scala.inline
    def apply(detectedSourceLanguage: String, translatedText: String): DetectedSourceLanguage = {
      val __obj = js.Dynamic.literal(detectedSourceLanguage = detectedSourceLanguage.asInstanceOf[js.Any], translatedText = translatedText.asInstanceOf[js.Any])
      __obj.asInstanceOf[DetectedSourceLanguage]
    }
    
    @scala.inline
    implicit class DetectedSourceLanguageMutableBuilder[Self <: DetectedSourceLanguage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetectedSourceLanguage(value: String): Self = StObject.set(x, "detectedSourceLanguage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslatedText(value: String): Self = StObject.set(x, "translatedText", value.asInstanceOf[js.Any])
    }
  }
  
  trait Detections extends StObject {
    
    var detections: js.Array[js.Array[Confidence]]
  }
  object Detections {
    
    @scala.inline
    def apply(detections: js.Array[js.Array[Confidence]]): Detections = {
      val __obj = js.Dynamic.literal(detections = detections.asInstanceOf[js.Any])
      __obj.asInstanceOf[Detections]
    }
    
    @scala.inline
    implicit class DetectionsMutableBuilder[Self <: Detections] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetections(value: js.Array[js.Array[Confidence]]): Self = StObject.set(x, "detections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetectionsVarargs(value: js.Array[Confidence]*): Self = StObject.set(x, "detections", js.Array(value :_*))
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
    
    @scala.inline
    def apply(q: js.Array[String]): Fields = {
      val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any])
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setQ(value: js.Array[String]): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQVarargs(value: String*): Self = StObject.set(x, "q", js.Array(value :_*))
    }
  }
  
  trait Language extends StObject {
    
    var language: String
    
    var name: String
  }
  object Language {
    
    @scala.inline
    def apply(language: String, name: String): Language = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Language]
    }
    
    @scala.inline
    implicit class LanguageMutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Languages extends StObject {
    
    var languages: js.Array[Language]
  }
  object Languages {
    
    @scala.inline
    def apply(languages: js.Array[Language]): Languages = {
      val __obj = js.Dynamic.literal(languages = languages.asInstanceOf[js.Any])
      __obj.asInstanceOf[Languages]
    }
    
    @scala.inline
    implicit class LanguagesMutableBuilder[Self <: Languages] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLanguages(value: js.Array[Language]): Self = StObject.set(x, "languages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguagesVarargs(value: Language*): Self = StObject.set(x, "languages", js.Array(value :_*))
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
    
    @scala.inline
    def apply(): Target = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Target]
    }
    
    @scala.inline
    implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait Translations extends StObject {
    
    var translations: js.Array[DetectedSourceLanguage]
  }
  object Translations {
    
    @scala.inline
    def apply(translations: js.Array[DetectedSourceLanguage]): Translations = {
      val __obj = js.Dynamic.literal(translations = translations.asInstanceOf[js.Any])
      __obj.asInstanceOf[Translations]
    }
    
    @scala.inline
    implicit class TranslationsMutableBuilder[Self <: Translations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTranslations(value: js.Array[DetectedSourceLanguage]): Self = StObject.set(x, "translations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslationsVarargs(value: DetectedSourceLanguage*): Self = StObject.set(x, "translations", js.Array(value :_*))
    }
  }
}
