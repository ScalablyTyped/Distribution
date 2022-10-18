package typings.ecmarkup

import typings.ecmarkup.anon.`1`
import typings.ecmarkup.ecmarkupStrings.clause
import typings.ecmarkup.ecmarkupStrings.example
import typings.ecmarkup.ecmarkupStrings.figure
import typings.ecmarkup.ecmarkupStrings.mixed
import typings.ecmarkup.ecmarkupStrings.normal
import typings.ecmarkup.ecmarkupStrings.note
import typings.ecmarkup.ecmarkupStrings.op
import typings.ecmarkup.ecmarkupStrings.production
import typings.ecmarkup.ecmarkupStrings.step
import typings.ecmarkup.ecmarkupStrings.table
import typings.ecmarkup.ecmarkupStrings.term
import typings.std.Exclude
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBiblioMod {
  
  @JSImport("ecmarkup/lib/Biblio", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getKeys(entry: TermBiblioEntry): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeys")(entry.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  trait AlgorithmBiblioEntry
    extends StObject
       with BiblioEntryBase
       with BiblioEntry {
    
    @JSName("aoid")
    var aoid_AlgorithmBiblioEntry: String
    
    var effects: js.Array[String]
    
    var kind: js.UndefOr[AlgorithmType] = js.undefined
    
    var signature: Null | Signature
    
    @JSName("type")
    var type_AlgorithmBiblioEntry: op
  }
  object AlgorithmBiblioEntry {
    
    inline def apply(aoid: String, effects: js.Array[String], location: String, referencingIds: js.Array[String]): AlgorithmBiblioEntry = {
      val __obj = js.Dynamic.literal(aoid = aoid.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], signature = null)
      __obj.updateDynamic("type")("op")
      __obj.asInstanceOf[AlgorithmBiblioEntry]
    }
    
    extension [Self <: AlgorithmBiblioEntry](x: Self) {
      
      inline def setAoid(value: String): Self = StObject.set(x, "aoid", value.asInstanceOf[js.Any])
      
      inline def setEffects(value: js.Array[String]): Self = StObject.set(x, "effects", value.asInstanceOf[js.Any])
      
      inline def setEffectsVarargs(value: String*): Self = StObject.set(x, "effects", js.Array(value*))
      
      inline def setKind(value: AlgorithmType): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      inline def setSignature(value: Signature): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
      
      inline def setSignatureNull: Self = StObject.set(x, "signature", null)
      
      inline def setType(value: op): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ecmarkup.ecmarkupStrings.`abstract operation`
    - typings.ecmarkup.ecmarkupStrings.`host-defined abstract operation`
    - typings.ecmarkup.ecmarkupStrings.`implementation-defined abstract operation`
    - typings.ecmarkup.ecmarkupStrings.`syntax-directed operation`
    - typings.ecmarkup.ecmarkupStrings.`numeric method`
  */
  trait AlgorithmType extends StObject
  object AlgorithmType {
    
    inline def `abstract operation`: typings.ecmarkup.ecmarkupStrings.`abstract operation` = ("abstract operation").asInstanceOf[typings.ecmarkup.ecmarkupStrings.`abstract operation`]
    
    inline def `host-defined abstract operation`: typings.ecmarkup.ecmarkupStrings.`host-defined abstract operation` = ("host-defined abstract operation").asInstanceOf[typings.ecmarkup.ecmarkupStrings.`host-defined abstract operation`]
    
    inline def `implementation-defined abstract operation`: typings.ecmarkup.ecmarkupStrings.`implementation-defined abstract operation` = ("implementation-defined abstract operation").asInstanceOf[typings.ecmarkup.ecmarkupStrings.`implementation-defined abstract operation`]
    
    inline def `numeric method`: typings.ecmarkup.ecmarkupStrings.`numeric method` = ("numeric method").asInstanceOf[typings.ecmarkup.ecmarkupStrings.`numeric method`]
    
    inline def `syntax-directed operation`: typings.ecmarkup.ecmarkupStrings.`syntax-directed operation` = ("syntax-directed operation").asInstanceOf[typings.ecmarkup.ecmarkupStrings.`syntax-directed operation`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ecmarkup.libBiblioMod.AlgorithmBiblioEntry
    - typings.ecmarkup.libBiblioMod.ProductionBiblioEntry
    - typings.ecmarkup.libBiblioMod.ClauseBiblioEntry
    - typings.ecmarkup.libBiblioMod.TermBiblioEntry
    - typings.ecmarkup.libBiblioMod.FigureBiblioEntry
    - typings.ecmarkup.libBiblioMod.StepBiblioEntry
  */
  trait BiblioEntry extends StObject
  object BiblioEntry {
    
    inline def AlgorithmBiblioEntry(aoid: String, effects: js.Array[String], location: String, referencingIds: js.Array[String]): typings.ecmarkup.libBiblioMod.AlgorithmBiblioEntry = {
      val __obj = js.Dynamic.literal(aoid = aoid.asInstanceOf[js.Any], effects = effects.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], signature = null)
      __obj.updateDynamic("type")("op")
      __obj.asInstanceOf[typings.ecmarkup.libBiblioMod.AlgorithmBiblioEntry]
    }
    
    inline def ClauseBiblioEntry(
      id: String,
      location: String,
      number: String | Double,
      referencingIds: js.Array[String],
      title: String,
      titleHTML: String
    ): typings.ecmarkup.libBiblioMod.ClauseBiblioEntry = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleHTML = titleHTML.asInstanceOf[js.Any], aoid = null)
      __obj.updateDynamic("type")("clause")
      __obj.asInstanceOf[typings.ecmarkup.libBiblioMod.ClauseBiblioEntry]
    }
    
    inline def FigureBiblioEntry(
      id: String,
      location: String,
      number: String | Double,
      referencingIds: js.Array[String],
      `type`: table | figure | example | note
    ): typings.ecmarkup.libBiblioMod.FigureBiblioEntry = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.libBiblioMod.FigureBiblioEntry]
    }
    
    inline def ProductionBiblioEntry(location: String, name: String, referencingIds: js.Array[String]): typings.ecmarkup.libBiblioMod.ProductionBiblioEntry = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("production")
      __obj.asInstanceOf[typings.ecmarkup.libBiblioMod.ProductionBiblioEntry]
    }
    
    inline def StepBiblioEntry(id: String, location: String, referencingIds: js.Array[String], stepNumbers: js.Array[Double]): typings.ecmarkup.libBiblioMod.StepBiblioEntry = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], stepNumbers = stepNumbers.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("step")
      __obj.asInstanceOf[typings.ecmarkup.libBiblioMod.StepBiblioEntry]
    }
    
    inline def TermBiblioEntry(location: String, referencingIds: js.Array[String], term: String): typings.ecmarkup.libBiblioMod.TermBiblioEntry = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("term")
      __obj.asInstanceOf[typings.ecmarkup.libBiblioMod.TermBiblioEntry]
    }
  }
  
  trait BiblioEntryBase extends StObject {
    
    var aoid: js.UndefOr[String | Null] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var location: String
    
    var namespace: js.UndefOr[String] = js.undefined
    
    var refId: js.UndefOr[String] = js.undefined
    
    var referencingIds: js.Array[String]
    
    var `type`: String
  }
  object BiblioEntryBase {
    
    inline def apply(location: String, referencingIds: js.Array[String], `type`: String): BiblioEntryBase = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[BiblioEntryBase]
    }
    
    extension [Self <: BiblioEntryBase](x: Self) {
      
      inline def setAoid(value: String): Self = StObject.set(x, "aoid", value.asInstanceOf[js.Any])
      
      inline def setAoidNull: Self = StObject.set(x, "aoid", null)
      
      inline def setAoidUndefined: Self = StObject.set(x, "aoid", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
      
      inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
      
      inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
      
      inline def setRefIdUndefined: Self = StObject.set(x, "refId", js.undefined)
      
      inline def setReferencingIds(value: js.Array[String]): Self = StObject.set(x, "referencingIds", value.asInstanceOf[js.Any])
      
      inline def setReferencingIdsVarargs(value: String*): Self = StObject.set(x, "referencingIds", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClauseBiblioEntry
    extends StObject
       with BiblioEntryBase
       with BiblioEntry {
    
    @JSName("aoid")
    var aoid_ClauseBiblioEntry: String | Null
    
    @JSName("id")
    var id_ClauseBiblioEntry: String
    
    var number: String | Double
    
    var title: String
    
    var titleHTML: String
    
    @JSName("type")
    var type_ClauseBiblioEntry: clause
  }
  object ClauseBiblioEntry {
    
    inline def apply(
      id: String,
      location: String,
      number: String | Double,
      referencingIds: js.Array[String],
      title: String,
      titleHTML: String
    ): ClauseBiblioEntry = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleHTML = titleHTML.asInstanceOf[js.Any], aoid = null)
      __obj.updateDynamic("type")("clause")
      __obj.asInstanceOf[ClauseBiblioEntry]
    }
    
    extension [Self <: ClauseBiblioEntry](x: Self) {
      
      inline def setAoid(value: String): Self = StObject.set(x, "aoid", value.asInstanceOf[js.Any])
      
      inline def setAoidNull: Self = StObject.set(x, "aoid", null)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: String | Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleHTML(value: String): Self = StObject.set(x, "titleHTML", value.asInstanceOf[js.Any])
      
      inline def setType(value: clause): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ExportedBiblio extends StObject {
    
    var entries: js.Array[PartialBiblioEntry]
    
    var location: String
  }
  object ExportedBiblio {
    
    inline def apply(entries: js.Array[PartialBiblioEntry], location: String): ExportedBiblio = {
      val __obj = js.Dynamic.literal(entries = entries.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportedBiblio]
    }
    
    extension [Self <: ExportedBiblio](x: Self) {
      
      inline def setEntries(value: js.Array[PartialBiblioEntry]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
      
      inline def setEntriesVarargs(value: PartialBiblioEntry*): Self = StObject.set(x, "entries", js.Array(value*))
      
      inline def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
  
  trait FigureBiblioEntry
    extends StObject
       with BiblioEntryBase
       with BiblioEntry {
    
    var caption: js.UndefOr[String] = js.undefined
    
    var clauseId: js.UndefOr[String] = js.undefined
    
    @JSName("id")
    var id_FigureBiblioEntry: String
    
    var number: String | Double
    
    @JSName("type")
    var type_FigureBiblioEntry: table | figure | example | note
  }
  object FigureBiblioEntry {
    
    inline def apply(
      id: String,
      location: String,
      number: String | Double,
      referencingIds: js.Array[String],
      `type`: table | figure | example | note
    ): FigureBiblioEntry = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FigureBiblioEntry]
    }
    
    extension [Self <: FigureBiblioEntry](x: Self) {
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setClauseId(value: String): Self = StObject.set(x, "clauseId", value.asInstanceOf[js.Any])
      
      inline def setClauseIdUndefined: Self = StObject.set(x, "clauseId", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: String | Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setType(value: table | figure | example | note): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ecmarkup.ecmarkupStrings.location
    - typings.ecmarkup.ecmarkupStrings.referencingIds
    - typings.ecmarkup.ecmarkupStrings.namespace
  */
  trait NonExportedKeys extends StObject
  object NonExportedKeys {
    
    inline def location: typings.ecmarkup.ecmarkupStrings.location = "location".asInstanceOf[typings.ecmarkup.ecmarkupStrings.location]
    
    inline def namespace: typings.ecmarkup.ecmarkupStrings.namespace = "namespace".asInstanceOf[typings.ecmarkup.ecmarkupStrings.namespace]
    
    inline def referencingIds: typings.ecmarkup.ecmarkupStrings.referencingIds = "referencingIds".asInstanceOf[typings.ecmarkup.ecmarkupStrings.referencingIds]
  }
  
  trait Parameter extends StObject {
    
    var name: String
    
    var `type`: Null | Type
  }
  object Parameter {
    
    inline def apply(name: String): Parameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(null)
      __obj.asInstanceOf[Parameter]
    }
    
    extension [Self <: Parameter](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: Type): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeNull: Self = StObject.set(x, "type", null)
    }
  }
  
  type PartialBiblioEntry = Unkey[BiblioEntry, NonExportedKeys]
  
  trait ProductionBiblioEntry
    extends StObject
       with BiblioEntryBase
       with BiblioEntry {
    
    var name: String
    
    @JSName("type")
    var type_ProductionBiblioEntry: production
  }
  object ProductionBiblioEntry {
    
    inline def apply(location: String, name: String, referencingIds: js.Array[String]): ProductionBiblioEntry = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("production")
      __obj.asInstanceOf[ProductionBiblioEntry]
    }
    
    extension [Self <: ProductionBiblioEntry](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: production): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Signature extends StObject {
    
    var optionalParameters: js.Array[Parameter]
    
    var parameters: js.Array[Parameter]
    
    var `return`: Null | Type
  }
  object Signature {
    
    inline def apply(optionalParameters: js.Array[Parameter], parameters: js.Array[Parameter]): Signature = {
      val __obj = js.Dynamic.literal(optionalParameters = optionalParameters.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
      __obj.updateDynamic("return")(null)
      __obj.asInstanceOf[Signature]
    }
    
    extension [Self <: Signature](x: Self) {
      
      inline def setOptionalParameters(value: js.Array[Parameter]): Self = StObject.set(x, "optionalParameters", value.asInstanceOf[js.Any])
      
      inline def setOptionalParametersVarargs(value: Parameter*): Self = StObject.set(x, "optionalParameters", js.Array(value*))
      
      inline def setParameters(value: js.Array[Parameter]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
      
      inline def setParametersVarargs(value: Parameter*): Self = StObject.set(x, "parameters", js.Array(value*))
      
      inline def setReturn(value: Type): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
      
      inline def setReturnNull: Self = StObject.set(x, "return", null)
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
    
    inline def apply(id: String, location: String, referencingIds: js.Array[String], stepNumbers: js.Array[Double]): StepBiblioEntry = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], stepNumbers = stepNumbers.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("step")
      __obj.asInstanceOf[StepBiblioEntry]
    }
    
    extension [Self <: StepBiblioEntry](x: Self) {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setStepNumbers(value: js.Array[Double]): Self = StObject.set(x, "stepNumbers", value.asInstanceOf[js.Any])
      
      inline def setStepNumbersVarargs(value: Double*): Self = StObject.set(x, "stepNumbers", js.Array(value*))
      
      inline def setType(value: step): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait TermBiblioEntry
    extends StObject
       with BiblioEntryBase
       with BiblioEntry {
    
    var term: String
    
    @JSName("type")
    var type_TermBiblioEntry: term
    
    var variants: js.UndefOr[js.Array[String]] = js.undefined
  }
  object TermBiblioEntry {
    
    inline def apply(location: String, referencingIds: js.Array[String], term: String): TermBiblioEntry = {
      val __obj = js.Dynamic.literal(location = location.asInstanceOf[js.Any], referencingIds = referencingIds.asInstanceOf[js.Any], term = term.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("term")
      __obj.asInstanceOf[TermBiblioEntry]
    }
    
    extension [Self <: TermBiblioEntry](x: Self) {
      
      inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
      
      inline def setType(value: term): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVariants(value: js.Array[String]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
      
      inline def setVariantsVarargs(value: String*): Self = StObject.set(x, "variants", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ecmarkup.anon.Kind
    - typings.ecmarkup.anon.`0`
    - typings.ecmarkup.anon.CompletionType
    - typings.ecmarkup.anon.TypeOfValueIfNormal
    - typings.ecmarkup.anon.Elements
    - typings.ecmarkup.anon.Types
    - typings.ecmarkup.anon.Fields
  */
  trait Type extends StObject
  object Type {
    
    inline def `0`(): typings.ecmarkup.anon.`0` = {
      val __obj = js.Dynamic.literal(kind = "unused")
      __obj.asInstanceOf[typings.ecmarkup.anon.`0`]
    }
    
    inline def CompletionType(): typings.ecmarkup.anon.CompletionType = {
      val __obj = js.Dynamic.literal(completionType = "abrupt", kind = "completion")
      __obj.asInstanceOf[typings.ecmarkup.anon.CompletionType]
    }
    
    inline def Elements(): typings.ecmarkup.anon.Elements = {
      val __obj = js.Dynamic.literal(kind = "list", elements = null)
      __obj.asInstanceOf[typings.ecmarkup.anon.Elements]
    }
    
    inline def Fields(fields: Record[String, Type | Null]): typings.ecmarkup.anon.Fields = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], kind = "record")
      __obj.asInstanceOf[typings.ecmarkup.anon.Fields]
    }
    
    inline def Kind(`type`: String): typings.ecmarkup.anon.Kind = {
      val __obj = js.Dynamic.literal(kind = "opaque")
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.anon.Kind]
    }
    
    inline def TypeOfValueIfNormal(completionType: normal | mixed): typings.ecmarkup.anon.TypeOfValueIfNormal = {
      val __obj = js.Dynamic.literal(completionType = completionType.asInstanceOf[js.Any], kind = "completion", typeOfValueIfNormal = null)
      __obj.asInstanceOf[typings.ecmarkup.anon.TypeOfValueIfNormal]
    }
    
    inline def Types(types: js.Array[Exclude[Type, `1`]]): typings.ecmarkup.anon.Types = {
      val __obj = js.Dynamic.literal(kind = "union", types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.anon.Types]
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends any ? std.Omit<T, S> : never
    }}}
    */
  @js.native
  trait Unkey[T, S /* <: String */] extends StObject
}
