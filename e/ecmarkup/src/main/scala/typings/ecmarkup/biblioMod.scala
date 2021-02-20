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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object biblioMod {
  
  @js.native
  trait AlgorithmBiblioEntry
    extends BiblioEntryBase
       with BiblioEntry {
    
    @JSName("aoid")
    var aoid_AlgorithmBiblioEntry: String = js.native
    
    @JSName("type")
    var type_AlgorithmBiblioEntry: op = js.native
  }
  object AlgorithmBiblioEntry {
    
    @scala.inline
    def apply(aoid: String, referencingIds: js.Array[String], `type`: op): AlgorithmBiblioEntry = {
      val __obj = js.Dynamic.literal(aoid = aoid.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AlgorithmBiblioEntry]
    }
    
    @scala.inline
    implicit class AlgorithmBiblioEntryMutableBuilder[Self <: AlgorithmBiblioEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAoid(value: String): Self = StObject.set(x, "aoid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: op): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def AlgorithmBiblioEntry(aoid: String, referencingIds: js.Array[String], `type`: op): typings.ecmarkup.biblioMod.AlgorithmBiblioEntry = {
      val __obj = js.Dynamic.literal(aoid = aoid.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.biblioMod.AlgorithmBiblioEntry]
    }
    
    @scala.inline
    def ClauseBiblioEntry(
      aoid: String,
      id: String,
      number: String | Double,
      referencingIds: js.Array[String],
      title: String,
      titleHTML: String,
      `type`: clause
    ): typings.ecmarkup.biblioMod.ClauseBiblioEntry = {
      val __obj = js.Dynamic.literal(aoid = aoid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleHTML = titleHTML.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.biblioMod.ClauseBiblioEntry]
    }
    
    @scala.inline
    def FigureBiblioEntry(
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
    
    @scala.inline
    def ProductionBiblioEntry(name: String, referencingIds: js.Array[String], `type`: production): typings.ecmarkup.biblioMod.ProductionBiblioEntry = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.biblioMod.ProductionBiblioEntry]
    }
    
    @scala.inline
    def StepBiblioEntry(id: String, referencingIds: js.Array[String], stepNumbers: js.Array[Double], `type`: step): typings.ecmarkup.biblioMod.StepBiblioEntry = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], stepNumbers = stepNumbers.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.biblioMod.StepBiblioEntry]
    }
    
    @scala.inline
    def TermBiblioEntry(refId: String, referencingIds: js.Array[String], term: String, `type`: term): typings.ecmarkup.biblioMod.TermBiblioEntry = {
      val __obj = js.Dynamic.literal(refId = refId.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.biblioMod.TermBiblioEntry]
    }
  }
  
  @js.native
  trait BiblioEntryBase extends StObject {
    
    var aoid: js.UndefOr[String] = js.native
    
    var caption: js.UndefOr[String] = js.native
    
    var clauseId: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var location: js.UndefOr[String] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var namespace: js.UndefOr[String] = js.native
    
    var number: js.UndefOr[String | Double] = js.native
    
    var refId: js.UndefOr[String] = js.native
    
    var referencingIds: js.Array[String] = js.native
    
    var term: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var `type`: String = js.native
  }
  object BiblioEntryBase {
    
    @scala.inline
    def apply(referencingIds: js.Array[String], `type`: String): BiblioEntryBase = {
      val __obj = js.Dynamic.literal(referencingIds = referencingIds.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BiblioEntryBase]
    }
    
    @scala.inline
    implicit class BiblioEntryBaseMutableBuilder[Self <: BiblioEntryBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAoid(value: String): Self = StObject.set(x, "aoid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAoidUndefined: Self = StObject.set(x, "aoid", js.undefined)
      
      @scala.inline
      def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      @scala.inline
      def setClauseId(value: String): Self = StObject.set(x, "clauseId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClauseIdUndefined: Self = StObject.set(x, "clauseId", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      @scala.inline
      def setNumber(value: String | Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
      
      @scala.inline
      def setReferencingIds(value: js.Array[String]): Self = StObject.set(x, "referencingIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReferencingIdsVarargs(value: String*): Self = StObject.set(x, "referencingIds", js.Array(value :_*))
      
      @scala.inline
      def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ClauseBiblioEntry
    extends BiblioEntryBase
       with BiblioEntry {
    
    @JSName("aoid")
    var aoid_ClauseBiblioEntry: String = js.native
    
    @JSName("id")
    var id_ClauseBiblioEntry: String = js.native
    
    @JSName("number")
    var number_ClauseBiblioEntry: String | Double = js.native
    
    var titleHTML: String = js.native
    
    @JSName("title")
    var title_ClauseBiblioEntry: String = js.native
    
    @JSName("type")
    var type_ClauseBiblioEntry: clause = js.native
  }
  object ClauseBiblioEntry {
    
    @scala.inline
    def apply(
      aoid: String,
      id: String,
      number: String | Double,
      referencingIds: js.Array[String],
      title: String,
      titleHTML: String,
      `type`: clause
    ): ClauseBiblioEntry = {
      val __obj = js.Dynamic.literal(aoid = aoid.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleHTML = titleHTML.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClauseBiblioEntry]
    }
    
    @scala.inline
    implicit class ClauseBiblioEntryMutableBuilder[Self <: ClauseBiblioEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAoid(value: String): Self = StObject.set(x, "aoid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: String | Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleHTML(value: String): Self = StObject.set(x, "titleHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: clause): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FigureBiblioEntry
    extends BiblioEntryBase
       with BiblioEntry {
    
    @JSName("id")
    var id_FigureBiblioEntry: String = js.native
    
    var node: HTMLElement = js.native
    
    @JSName("number")
    var number_FigureBiblioEntry: String | Double = js.native
    
    @JSName("type")
    var type_FigureBiblioEntry: table | figure | example | note = js.native
  }
  object FigureBiblioEntry {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class FigureBiblioEntryMutableBuilder[Self <: FigureBiblioEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: HTMLElement): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: String | Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: table | figure | example | note): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProductionBiblioEntry
    extends BiblioEntryBase
       with BiblioEntry {
    
    @JSName("name")
    var name_ProductionBiblioEntry: String = js.native
    
    @JSName("type")
    var type_ProductionBiblioEntry: production = js.native
  }
  object ProductionBiblioEntry {
    
    @scala.inline
    def apply(name: String, referencingIds: js.Array[String], `type`: production): ProductionBiblioEntry = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProductionBiblioEntry]
    }
    
    @scala.inline
    implicit class ProductionBiblioEntryMutableBuilder[Self <: ProductionBiblioEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: production): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StepBiblioEntry
    extends BiblioEntryBase
       with BiblioEntry {
    
    @JSName("id")
    var id_StepBiblioEntry: String = js.native
    
    var stepNumbers: js.Array[Double] = js.native
    
    @JSName("type")
    var type_StepBiblioEntry: step = js.native
  }
  object StepBiblioEntry {
    
    @scala.inline
    def apply(id: String, referencingIds: js.Array[String], stepNumbers: js.Array[Double], `type`: step): StepBiblioEntry = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], stepNumbers = stepNumbers.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[StepBiblioEntry]
    }
    
    @scala.inline
    implicit class StepBiblioEntryMutableBuilder[Self <: StepBiblioEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepNumbers(value: js.Array[Double]): Self = StObject.set(x, "stepNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepNumbersVarargs(value: Double*): Self = StObject.set(x, "stepNumbers", js.Array(value :_*))
      
      @scala.inline
      def setType(value: step): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TermBiblioEntry
    extends BiblioEntryBase
       with BiblioEntry {
    
    @JSName("refId")
    var refId_TermBiblioEntry: String = js.native
    
    @JSName("term")
    var term_TermBiblioEntry: String = js.native
    
    @JSName("type")
    var type_TermBiblioEntry: term = js.native
  }
  object TermBiblioEntry {
    
    @scala.inline
    def apply(refId: String, referencingIds: js.Array[String], term: String, `type`: term): TermBiblioEntry = {
      val __obj = js.Dynamic.literal(refId = refId.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TermBiblioEntry]
    }
    
    @scala.inline
    implicit class TermBiblioEntryMutableBuilder[Self <: TermBiblioEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: term): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
