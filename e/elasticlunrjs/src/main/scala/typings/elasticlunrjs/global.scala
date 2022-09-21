package typings.elasticlunrjs

import typings.elasticlunrjs.mod.PipelineFunction
import typings.elasticlunrjs.mod.SerialisedDocumentStore
import typings.elasticlunrjs.mod.SerialisedIndexData
import typings.elasticlunrjs.mod.SerialisedInvertedIndex
import typings.elasticlunrjs.mod.SerialisedPipeline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object elasticlunr {
    
    inline def apply[T /* <: js.Object */](): typings.elasticlunrjs.mod.Index[T] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.elasticlunrjs.mod.Index[T]]
    inline def apply[T /* <: js.Object */](
      config: js.ThisFunction1[
          /* this */ typings.elasticlunrjs.mod.Index[T], 
          /* idx */ typings.elasticlunrjs.mod.Index[T], 
          Unit
        ]
    ): typings.elasticlunrjs.mod.Index[T] = ^.asInstanceOf[js.Dynamic].apply(config.asInstanceOf[js.Any]).asInstanceOf[typings.elasticlunrjs.mod.Index[T]]
    
    @JSGlobal("elasticlunr")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("elasticlunr.Configuration")
    @js.native
    open class Configuration[T /* <: js.Object */] protected ()
      extends typings.elasticlunrjs.mod.Configuration[T] {
      def this(config: String, fields: js.Array[/* keyof T */ String]) = this()
    }
    
    @JSGlobal("elasticlunr.DocumentStore")
    @js.native
    open class DocumentStore[T] ()
      extends typings.elasticlunrjs.mod.DocumentStore[T] {
      def this(save: Boolean) = this()
    }
    object DocumentStore {
      
      @JSGlobal("elasticlunr.DocumentStore")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def load[T](serialisedData: SerialisedDocumentStore[T]): typings.elasticlunrjs.mod.DocumentStore[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(serialisedData.asInstanceOf[js.Any]).asInstanceOf[typings.elasticlunrjs.mod.DocumentStore[T]]
    }
    
    @JSGlobal("elasticlunr.EventEmitter")
    @js.native
    open class EventEmitter ()
      extends typings.elasticlunrjs.mod.EventEmitter
    
    @JSGlobal("elasticlunr.Index")
    @js.native
    open class Index[T /* <: js.Object */] ()
      extends typings.elasticlunrjs.mod.Index[T]
    object Index {
      
      @JSGlobal("elasticlunr.Index")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def load[T /* <: js.Object */](serialisedData: SerialisedIndexData[T]): typings.elasticlunrjs.mod.Index[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(serialisedData.asInstanceOf[js.Any]).asInstanceOf[typings.elasticlunrjs.mod.Index[T]]
    }
    
    @JSGlobal("elasticlunr.InvertedIndex")
    @js.native
    open class InvertedIndex ()
      extends typings.elasticlunrjs.mod.InvertedIndex
    object InvertedIndex {
      
      @JSGlobal("elasticlunr.InvertedIndex")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def load(serialisedData: SerialisedInvertedIndex): typings.elasticlunrjs.mod.InvertedIndex = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(serialisedData.asInstanceOf[js.Any]).asInstanceOf[typings.elasticlunrjs.mod.InvertedIndex]
    }
    
    @JSGlobal("elasticlunr.Pipeline")
    @js.native
    open class Pipeline ()
      extends typings.elasticlunrjs.mod.Pipeline
    object Pipeline {
      
      @JSGlobal("elasticlunr.Pipeline")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def getRegisteredFunction(label: String): PipelineFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegisteredFunction")(label.asInstanceOf[js.Any]).asInstanceOf[PipelineFunction]
      
      /* static member */
      inline def load(serialised: SerialisedPipeline): typings.elasticlunrjs.mod.Pipeline = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(serialised.asInstanceOf[js.Any]).asInstanceOf[typings.elasticlunrjs.mod.Pipeline]
      
      /* static member */
      inline def registerFunction(fn: PipelineFunction, label: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFunction")(fn.asInstanceOf[js.Any], label.asInstanceOf[js.Any])).asInstanceOf[Unit]
      
      object registeredFunctions {
        
        object stemmer {
          
          inline def apply(token: String): String = ^.asInstanceOf[js.Dynamic].apply(token.asInstanceOf[js.Any]).asInstanceOf[String]
          
          @JSGlobal("elasticlunr.Pipeline.registeredFunctions.stemmer")
          @js.native
          val ^ : js.Any = js.native
          
          @JSGlobal("elasticlunr.Pipeline.registeredFunctions.stemmer.label")
          @js.native
          val label: String = js.native
        }
        
        object stopWordFilter {
          
          inline def apply(token: String): String = ^.asInstanceOf[js.Dynamic].apply(token.asInstanceOf[js.Any]).asInstanceOf[String]
          
          @JSGlobal("elasticlunr.Pipeline.registeredFunctions.stopWordFilter")
          @js.native
          val ^ : js.Any = js.native
          
          @JSGlobal("elasticlunr.Pipeline.registeredFunctions.stopWordFilter.label")
          @js.native
          val label: String = js.native
        }
        
        object trimmer {
          
          inline def apply(token: String): String = ^.asInstanceOf[js.Dynamic].apply(token.asInstanceOf[js.Any]).asInstanceOf[String]
          
          @JSGlobal("elasticlunr.Pipeline.registeredFunctions.trimmer")
          @js.native
          val ^ : js.Any = js.native
          
          @JSGlobal("elasticlunr.Pipeline.registeredFunctions.trimmer.label")
          @js.native
          val label: String = js.native
        }
      }
      
      /* static member */
      inline def warnIfFunctionNotRegistered(fn: PipelineFunction): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warnIfFunctionNotRegistered")(fn.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    @JSGlobal("elasticlunr.SortedSet")
    @js.native
    open class SortedSet[T] ()
      extends typings.elasticlunrjs.mod.SortedSet[T]
    object SortedSet {
      
      @JSGlobal("elasticlunr.SortedSet")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def load[T](serialisedData: js.Array[T]): typings.elasticlunrjs.mod.SortedSet[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("load")(serialisedData.asInstanceOf[js.Any]).asInstanceOf[typings.elasticlunrjs.mod.SortedSet[T]]
    }
    
    inline def addStopWords(words: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addStopWords")(words.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def clearStopWords(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearStopWords")().asInstanceOf[Unit]
    
    inline def generateStopWordFilter(stopWords: js.Array[String]): PipelineFunction = ^.asInstanceOf[js.Dynamic].applyDynamic("generateStopWordFilter")(stopWords.asInstanceOf[js.Any]).asInstanceOf[PipelineFunction]
    
    inline def resetStopWords(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetStopWords")().asInstanceOf[Unit]
    
    object stemmer {
      
      inline def apply(token: String): String = ^.asInstanceOf[js.Dynamic].apply(token.asInstanceOf[js.Any]).asInstanceOf[String]
      
      @JSGlobal("elasticlunr.stemmer")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("elasticlunr.stemmer.label")
      @js.native
      val label: String = js.native
    }
    
    object stopWordFilter {
      
      inline def apply(token: String): String = ^.asInstanceOf[js.Dynamic].apply(token.asInstanceOf[js.Any]).asInstanceOf[String]
      
      @JSGlobal("elasticlunr.stopWordFilter")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("elasticlunr.stopWordFilter.label")
      @js.native
      val label: String = js.native
    }
    
    object tokenizer {
      
      inline def apply(): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Array[String]]
      inline def apply(str: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].apply(str.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
      
      @JSGlobal("elasticlunr.tokenizer")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("elasticlunr.tokenizer.defaultSeperator")
      @js.native
      val defaultSeperator: js.RegExp = js.native
      
      inline def getSeperator(): js.RegExp = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeperator")().asInstanceOf[js.RegExp]
      
      inline def resetSeperator(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("resetSeperator")().asInstanceOf[Unit]
      
      @JSGlobal("elasticlunr.tokenizer.seperator")
      @js.native
      val seperator: js.RegExp = js.native
      
      inline def setSeperator(sep: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setSeperator")(sep.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    object trimmer {
      
      inline def apply(token: String): String = ^.asInstanceOf[js.Dynamic].apply(token.asInstanceOf[js.Any]).asInstanceOf[String]
      
      @JSGlobal("elasticlunr.trimmer")
      @js.native
      val ^ : js.Any = js.native
      
      @JSGlobal("elasticlunr.trimmer.label")
      @js.native
      val label: String = js.native
    }
    
    object utils {
      
      @JSGlobal("elasticlunr.utils")
      @js.native
      val ^ : js.Any = js.native
      
      inline def toString_(obj: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toString")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
      
      inline def warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
    }
    
    @JSGlobal("elasticlunr.version")
    @js.native
    val version: String = js.native
  }
}
