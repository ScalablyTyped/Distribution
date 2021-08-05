package typings.ecmarkup

import org.scalablytyped.runtime.StringDictionary
import typings.ecmarkup.ecmarkupStrings.clause
import typings.ecmarkup.ecmarkupStrings.example
import typings.ecmarkup.ecmarkupStrings.figure
import typings.ecmarkup.ecmarkupStrings.note
import typings.ecmarkup.ecmarkupStrings.op
import typings.ecmarkup.ecmarkupStrings.production
import typings.ecmarkup.ecmarkupStrings.step
import typings.ecmarkup.ecmarkupStrings.table
import typings.ecmarkup.ecmarkupStrings.term
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object biblioMod {
  
  trait AlgorithmBiblioEntry
    extends StObject
       with BiblioEntryBase
       with BiblioEntry {
    
    @JSName("aoid")
    var aoid_AlgorithmBiblioEntry: String
    
    @JSName("type")
    var type_AlgorithmBiblioEntry: op
  }
  object AlgorithmBiblioEntry {
    
    inline def apply(aoid: String, referencingIds: js.Array[String]): AlgorithmBiblioEntry = {
      val __obj = js.Dynamic.literal(aoid = aoid.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("op")
      __obj.asInstanceOf[AlgorithmBiblioEntry]
    }
    
    extension [Self <: AlgorithmBiblioEntry](x: Self) {
      
      inline def setAoid(value: String): Self = StObject.set(x, "aoid", value.asInstanceOf[js.Any])
      
      inline def setType(value: op): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type BiblioData = StringDictionary[js.Array[BiblioEntry]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ecmarkup.biblioMod.AlgorithmBiblioEntry
    - typings.ecmarkup.biblioMod.ProductionBiblioEntry
    - typings.ecmarkup.biblioMod.ClauseBiblioEntry
    - typings.ecmarkup.biblioMod.TermBiblioEntry
    - typings.ecmarkup.biblioMod.FigureBiblioEntry
    - typings.ecmarkup.biblioMod.StepBiblioEntry
  */
  trait BiblioEntry extends StObject
  object BiblioEntry {
    
    inline def AlgorithmBiblioEntry(aoid: String, referencingIds: js.Array[String]): typings.ecmarkup.biblioMod.AlgorithmBiblioEntry = {
      val __obj = js.Dynamic.literal(aoid = aoid.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("op")
      __obj.asInstanceOf[typings.ecmarkup.biblioMod.AlgorithmBiblioEntry]
    }
    
    inline def ClauseBiblioEntry(
      aoid: String,
      id: String,
      number: String | Double,
      referencingIds: js.Array[String],
      title: String,
      titleHTML: String
    ): typings.ecmarkup.biblioMod.ClauseBiblioEntry = {
      val __obj = js.Dynamic.literal(aoid = aoid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleHTML = titleHTML.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("clause")
      __obj.asInstanceOf[typings.ecmarkup.biblioMod.ClauseBiblioEntry]
    }
    
    inline def FigureBiblioEntry(
      id: String,
      node: HTMLElement,
      number: String | Double,
      referencingIds: js.Array[String],
      `type`: table | figure | example | note
    ): typings.ecmarkup.biblioMod.FigureBiblioEntry = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.biblioMod.FigureBiblioEntry]
    }
    
    inline def ProductionBiblioEntry(name: String, referencingIds: js.Array[String]): typings.ecmarkup.biblioMod.ProductionBiblioEntry = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("production")
      __obj.asInstanceOf[typings.ecmarkup.biblioMod.ProductionBiblioEntry]
    }
    
    inline def StepBiblioEntry(id: String, referencingIds: js.Array[String], stepNumbers: js.Array[Double]): typings.ecmarkup.biblioMod.StepBiblioEntry = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], stepNumbers = stepNumbers.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("step")
      __obj.asInstanceOf[typings.ecmarkup.biblioMod.StepBiblioEntry]
    }
    
    inline def TermBiblioEntry(refId: String, referencingIds: js.Array[String], term: String): typings.ecmarkup.biblioMod.TermBiblioEntry = {
      val __obj = js.Dynamic.literal(refId = refId.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("term")
      __obj.asInstanceOf[typings.ecmarkup.biblioMod.TermBiblioEntry]
    }
  }
  
  trait BiblioEntryBase extends StObject {
    
    var aoid: js.UndefOr[String] = js.undefined
    
    var caption: js.UndefOr[String] = js.undefined
    
    var clauseId: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var location: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var namespace: js.UndefOr[String] = js.undefined
    
    var number: js.UndefOr[String | Double] = js.undefined
    
    var refId: js.UndefOr[String] = js.undefined
    
    var referencingIds: js.Array[String]
    
    var term: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var `type`: String
  }
  object BiblioEntryBase {
    
    inline def apply(referencingIds: js.Array[String], `type`: String): BiblioEntryBase = {
      val __obj = js.Dynamic.literal(referencingIds = referencingIds.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BiblioEntryBase]
    }
    
    extension [Self <: BiblioEntryBase](x: Self) {
      
      inline def setAoid(value: String): Self = StObject.set(x, "aoid", value.asInstanceOf[js.Any])
      
      inline def setAoidUndefined: Self = StObject.set(x, "aoid", js.undefined)
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setClauseId(value: String): Self = StObject.set(x, "clauseId", value.asInstanceOf[js.Any])
      
      inline def setClauseIdUndefined: Self = StObject.set(x, "clauseId", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setNumber(value: String | Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      inline def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
      
      inline def setReferencingIds(value: js.Array[String]): Self = StObject.set(x, "referencingIds", value.asInstanceOf[js.Any])
      
      inline def setReferencingIdsVarargs(value: String*): Self = StObject.set(x, "referencingIds", js.Array(value :_*))
      
      inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
      
      inline def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClauseBiblioEntry
    extends StObject
       with BiblioEntryBase
       with BiblioEntry {
    
    @JSName("aoid")
    var aoid_ClauseBiblioEntry: String
    
    @JSName("id")
    var id_ClauseBiblioEntry: String
    
    @JSName("number")
    var number_ClauseBiblioEntry: String | Double
    
    var titleHTML: String
    
    @JSName("title")
    var title_ClauseBiblioEntry: String
    
    @JSName("type")
    var type_ClauseBiblioEntry: clause
  }
  object ClauseBiblioEntry {
    
    inline def apply(
      aoid: String,
      id: String,
      number: String | Double,
      referencingIds: js.Array[String],
      title: String,
      titleHTML: String
    ): ClauseBiblioEntry = {
      val __obj = js.Dynamic.literal(aoid = aoid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleHTML = titleHTML.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("clause")
      __obj.asInstanceOf[ClauseBiblioEntry]
    }
    
    extension [Self <: ClauseBiblioEntry](x: Self) {
      
      inline def setAoid(value: String): Self = StObject.set(x, "aoid", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: String | Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleHTML(value: String): Self = StObject.set(x, "titleHTML", value.asInstanceOf[js.Any])
      
      inline def setType(value: clause): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait FigureBiblioEntry
    extends StObject
       with BiblioEntryBase
       with BiblioEntry {
    
    @JSName("id")
    var id_FigureBiblioEntry: String
    
    var node: HTMLElement
    
    @JSName("number")
    var number_FigureBiblioEntry: String | Double
    
    @JSName("type")
    var type_FigureBiblioEntry: table | figure | example | note
  }
  object FigureBiblioEntry {
    
    inline def apply(
      id: String,
      node: HTMLElement,
      number: String | Double,
      referencingIds: js.Array[String],
      `type`: table | figure | example | note
    ): FigureBiblioEntry = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FigureBiblioEntry]
    }
    
    extension [Self <: FigureBiblioEntry](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: String | Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setType(value: table | figure | example | note): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProductionBiblioEntry
    extends StObject
       with BiblioEntryBase
       with BiblioEntry {
    
    @JSName("name")
    var name_ProductionBiblioEntry: String
    
    @JSName("type")
    var type_ProductionBiblioEntry: production
  }
  object ProductionBiblioEntry {
    
    inline def apply(name: String, referencingIds: js.Array[String]): ProductionBiblioEntry = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("production")
      __obj.asInstanceOf[ProductionBiblioEntry]
    }
    
    extension [Self <: ProductionBiblioEntry](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: production): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait StepBiblioEntry
    extends StObject
       with BiblioEntryBase
       with BiblioEntry {
    
    @JSName("id")
    var id_StepBiblioEntry: String
    
    var stepNumbers: js.Array[Double]
    
    @JSName("type")
    var type_StepBiblioEntry: step
  }
  object StepBiblioEntry {
    
    inline def apply(id: String, referencingIds: js.Array[String], stepNumbers: js.Array[Double]): StepBiblioEntry = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], stepNumbers = stepNumbers.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("step")
      __obj.asInstanceOf[StepBiblioEntry]
    }
    
    extension [Self <: StepBiblioEntry](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setStepNumbers(value: js.Array[Double]): Self = StObject.set(x, "stepNumbers", value.asInstanceOf[js.Any])
      
      inline def setStepNumbersVarargs(value: Double*): Self = StObject.set(x, "stepNumbers", js.Array(value :_*))
      
      inline def setType(value: step): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TermBiblioEntry
    extends StObject
       with BiblioEntryBase
       with BiblioEntry {
    
    @JSName("refId")
    var refId_TermBiblioEntry: String
    
    @JSName("term")
    var term_TermBiblioEntry: String
    
    @JSName("type")
    var type_TermBiblioEntry: term
  }
  object TermBiblioEntry {
    
    inline def apply(refId: String, referencingIds: js.Array[String], term: String): TermBiblioEntry = {
      val __obj = js.Dynamic.literal(refId = refId.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("term")
      __obj.asInstanceOf[TermBiblioEntry]
    }
    
    extension [Self <: TermBiblioEntry](x: Self) {
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
      
      inline def setType(value: term): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
