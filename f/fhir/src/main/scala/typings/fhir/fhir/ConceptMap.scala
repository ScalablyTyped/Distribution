package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A map from one set of concepts to one or more other concepts
  */
/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.fhir.fhir.Resource because Already inherited */ trait ConceptMap
  extends StObject
     with DomainResource {
  
  /**
    * Contains extended information for property 'copyright'.
    */
  var _copyright: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'date'.
    */
  var _date: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'description'.
    */
  var _description: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'experimental'.
    */
  var _experimental: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'name'.
    */
  var _name: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'publisher'.
    */
  var _publisher: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'purpose'.
    */
  var _purpose: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'sourceUri'.
    */
  var _sourceUri: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'status'.
    */
  var _status: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'targetUri'.
    */
  var _targetUri: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'title'.
    */
  var _title: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'url'.
    */
  var _url: js.UndefOr[Element] = js.undefined
  
  /**
    * Contains extended information for property 'version'.
    */
  var _version: js.UndefOr[Element] = js.undefined
  
  /**
    * Contact details for the publisher
    */
  var contact: js.UndefOr[js.Array[ContactDetail]] = js.undefined
  
  /**
    * Use and/or publishing restrictions
    */
  var copyright: js.UndefOr[markdown] = js.undefined
  
  /**
    * Date this was last changed
    */
  var date: js.UndefOr[dateTime] = js.undefined
  
  /**
    * Natural language description of the concept map
    */
  var description: js.UndefOr[markdown] = js.undefined
  
  /**
    * For testing purposes, not real usage
    */
  var experimental: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Same source and target systems
    */
  var group: js.UndefOr[js.Array[ConceptMapGroup]] = js.undefined
  
  /**
    * Additional identifier for the concept map
    */
  var identifier: js.UndefOr[Identifier] = js.undefined
  
  /**
    * Intended jurisdiction for concept map (if applicable)
    */
  var jurisdiction: js.UndefOr[js.Array[CodeableConcept]] = js.undefined
  
  /**
    * Name for this concept map (computer friendly)
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Name of the publisher (organization or individual)
    */
  var publisher: js.UndefOr[String] = js.undefined
  
  /**
    * Why this concept map is defined
    */
  var purpose: js.UndefOr[markdown] = js.undefined
  
  /**
    * Identifies the source of the concepts which are being mapped
    */
  var sourceReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Identifies the source of the concepts which are being mapped
    */
  var sourceUri: js.UndefOr[uri] = js.undefined
  
  /**
    * draft | active | retired | unknown
    */
  var status: code
  
  /**
    * Provides context to the mappings
    */
  var targetReference: js.UndefOr[Reference] = js.undefined
  
  /**
    * Provides context to the mappings
    */
  var targetUri: js.UndefOr[uri] = js.undefined
  
  /**
    * Name for this concept map (human friendly)
    */
  var title: js.UndefOr[String] = js.undefined
  
  /**
    * Logical URI to reference this concept map (globally unique)
    */
  var url: js.UndefOr[uri] = js.undefined
  
  /**
    * Context the content is intended to support
    */
  var useContext: js.UndefOr[js.Array[UsageContext]] = js.undefined
  
  /**
    * Business version of the concept map
    */
  var version: js.UndefOr[String] = js.undefined
}
object ConceptMap {
  
  @scala.inline
  def apply(status: code): ConceptMap = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConceptMap]
  }
  
  @scala.inline
  implicit class ConceptMapMutableBuilder[Self <: ConceptMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContact(value: js.Array[ContactDetail]): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContactUndefined: Self = StObject.set(x, "contact", js.undefined)
    
    @scala.inline
    def setContactVarargs(value: ContactDetail*): Self = StObject.set(x, "contact", js.Array(value :_*))
    
    @scala.inline
    def setCopyright(value: markdown): Self = StObject.set(x, "copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyrightUndefined: Self = StObject.set(x, "copyright", js.undefined)
    
    @scala.inline
    def setDate(value: dateTime): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
    
    @scala.inline
    def setDescription(value: markdown): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setExperimental(value: Boolean): Self = StObject.set(x, "experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalUndefined: Self = StObject.set(x, "experimental", js.undefined)
    
    @scala.inline
    def setGroup(value: js.Array[ConceptMapGroup]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setGroupVarargs(value: ConceptMapGroup*): Self = StObject.set(x, "group", js.Array(value :_*))
    
    @scala.inline
    def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    @scala.inline
    def setJurisdiction(value: js.Array[CodeableConcept]): Self = StObject.set(x, "jurisdiction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJurisdictionUndefined: Self = StObject.set(x, "jurisdiction", js.undefined)
    
    @scala.inline
    def setJurisdictionVarargs(value: CodeableConcept*): Self = StObject.set(x, "jurisdiction", js.Array(value :_*))
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherUndefined: Self = StObject.set(x, "publisher", js.undefined)
    
    @scala.inline
    def setPurpose(value: markdown): Self = StObject.set(x, "purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPurposeUndefined: Self = StObject.set(x, "purpose", js.undefined)
    
    @scala.inline
    def setSourceReference(value: Reference): Self = StObject.set(x, "sourceReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceReferenceUndefined: Self = StObject.set(x, "sourceReference", js.undefined)
    
    @scala.inline
    def setSourceUri(value: uri): Self = StObject.set(x, "sourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUriUndefined: Self = StObject.set(x, "sourceUri", js.undefined)
    
    @scala.inline
    def setStatus(value: code): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetReference(value: Reference): Self = StObject.set(x, "targetReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetReferenceUndefined: Self = StObject.set(x, "targetReference", js.undefined)
    
    @scala.inline
    def setTargetUri(value: uri): Self = StObject.set(x, "targetUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUriUndefined: Self = StObject.set(x, "targetUri", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setUrl(value: uri): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setUseContext(value: js.Array[UsageContext]): Self = StObject.set(x, "useContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseContextUndefined: Self = StObject.set(x, "useContext", js.undefined)
    
    @scala.inline
    def setUseContextVarargs(value: UsageContext*): Self = StObject.set(x, "useContext", js.Array(value :_*))
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def set_copyright(value: Element): Self = StObject.set(x, "_copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_copyrightUndefined: Self = StObject.set(x, "_copyright", js.undefined)
    
    @scala.inline
    def set_date(value: Element): Self = StObject.set(x, "_date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_dateUndefined: Self = StObject.set(x, "_date", js.undefined)
    
    @scala.inline
    def set_description(value: Element): Self = StObject.set(x, "_description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_descriptionUndefined: Self = StObject.set(x, "_description", js.undefined)
    
    @scala.inline
    def set_experimental(value: Element): Self = StObject.set(x, "_experimental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_experimentalUndefined: Self = StObject.set(x, "_experimental", js.undefined)
    
    @scala.inline
    def set_name(value: Element): Self = StObject.set(x, "_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_nameUndefined: Self = StObject.set(x, "_name", js.undefined)
    
    @scala.inline
    def set_publisher(value: Element): Self = StObject.set(x, "_publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_publisherUndefined: Self = StObject.set(x, "_publisher", js.undefined)
    
    @scala.inline
    def set_purpose(value: Element): Self = StObject.set(x, "_purpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_purposeUndefined: Self = StObject.set(x, "_purpose", js.undefined)
    
    @scala.inline
    def set_sourceUri(value: Element): Self = StObject.set(x, "_sourceUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_sourceUriUndefined: Self = StObject.set(x, "_sourceUri", js.undefined)
    
    @scala.inline
    def set_status(value: Element): Self = StObject.set(x, "_status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_statusUndefined: Self = StObject.set(x, "_status", js.undefined)
    
    @scala.inline
    def set_targetUri(value: Element): Self = StObject.set(x, "_targetUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_targetUriUndefined: Self = StObject.set(x, "_targetUri", js.undefined)
    
    @scala.inline
    def set_title(value: Element): Self = StObject.set(x, "_title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_titleUndefined: Self = StObject.set(x, "_title", js.undefined)
    
    @scala.inline
    def set_url(value: Element): Self = StObject.set(x, "_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_urlUndefined: Self = StObject.set(x, "_url", js.undefined)
    
    @scala.inline
    def set_version(value: Element): Self = StObject.set(x, "_version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_versionUndefined: Self = StObject.set(x, "_version", js.undefined)
  }
}
