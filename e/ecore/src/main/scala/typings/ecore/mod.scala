package typings.ecore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ecore", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("ecore", "EAnnotation")
  @js.native
  def EAnnotation: EAnnotation = js.native
  type EAnnotation = EModelElement
  inline def EAnnotation_=(x: EAnnotation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EAnnotation")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "EAttribute")
  @js.native
  def EAttribute: EAttribute = js.native
  type EAttribute = EStructuralFeature
  inline def EAttribute_=(x: EAttribute): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EAttribute")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "EBoolean")
  @js.native
  def EBoolean: EBoolean = js.native
  type EBoolean = EObject
  inline def EBoolean_=(x: EBoolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EBoolean")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "EClass")
  @js.native
  def EClass: EClass = js.native
  type EClass = EClassifier
  inline def EClass_=(x: EClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EClass")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "EClassifier")
  @js.native
  def EClassifier: EClassifier = js.native
  type EClassifier = ENamedElement
  inline def EClassifier_=(x: EClassifier): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EClassifier")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "EDataType")
  @js.native
  def EDataType: EDataType = js.native
  type EDataType = EClassifier
  inline def EDataType_=(x: EDataType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDataType")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "EDate")
  @js.native
  def EDate: EDate = js.native
  type EDate = EObject
  inline def EDate_=(x: EDate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDate")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "EDiagnosticChain")
  @js.native
  def EDiagnosticChain: EDiagnosticChain = js.native
  type EDiagnosticChain = EObject
  inline def EDiagnosticChain_=(x: EDiagnosticChain): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDiagnosticChain")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "EDouble")
  @js.native
  def EDouble: EDouble = js.native
  type EDouble = EObject
  inline def EDouble_=(x: EDouble): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EDouble")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "EEnum")
  @js.native
  def EEnum: EEnum = js.native
  type EEnum = EDataType
  
  @JSImport("ecore", "EEnumLiteral")
  @js.native
  def EEnumLiteral: EEnumLiteral = js.native
  type EEnumLiteral = ENamedElement
  inline def EEnumLiteral_=(x: EEnumLiteral): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EEnumLiteral")(x.asInstanceOf[js.Any])
  
  inline def EEnum_=(x: EEnum): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EEnum")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "EFloatObject")
  @js.native
  def EFloatObject: EFloatObject = js.native
  type EFloatObject = EObject
  inline def EFloatObject_=(x: EFloatObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EFloatObject")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "EGenericType")
  @js.native
  def EGenericType: EGenericType = js.native
  type EGenericType = EObject
  inline def EGenericType_=(x: EGenericType): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EGenericType")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "EInt")
  @js.native
  def EInt: EInt = js.native
  type EInt = EObject
  inline def EInt_=(x: EInt): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EInt")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "EIntegerObject")
  @js.native
  def EIntegerObject: EIntegerObject = js.native
  type EIntegerObject = EObject
  inline def EIntegerObject_=(x: EIntegerObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EIntegerObject")(x.asInstanceOf[js.Any])
  
  @js.native
  trait EList
    extends StObject
       with EObject {
    
    def add(eObject: EObject): EList = js.native
    
    def addAll(args: js.Array[EObject]): EList = js.native
    def addAll(args: EObject): EList = js.native
    
    def array(): js.Array[EObject] = js.native
    
    def at(position: Double): EObject = js.native
    
    def contains(eObject: EObject): Boolean = js.native
    
    def each(iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ this.type, Unit]): Unit = js.native
    def each(
      iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ this.type, Unit],
      context: js.Any
    ): Unit = js.native
    
    def filter(iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ this.type, Boolean]): js.Array[EObject] = js.native
    def filter(
      iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ this.type, Boolean],
      context: js.Any
    ): js.Array[EObject] = js.native
    
    def find(iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ this.type, Boolean]): js.Array[EObject] = js.native
    def find(
      iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ this.type, Boolean],
      context: js.Any
    ): js.Array[EObject] = js.native
    
    def first(): EObject = js.native
    
    def indexOf(eObject: EObject): Double = js.native
    
    def last(): EObject = js.native
    
    def map(iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ this.type, js.Any]): js.Array[js.Any] = js.native
    def map(
      iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ this.type, js.Any],
      context: js.Any
    ): js.Array[js.Any] = js.native
    
    def reject(iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ this.type, Boolean]): js.Array[EObject] = js.native
    def reject(
      iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ this.type, Boolean],
      context: js.Any
    ): js.Array[EObject] = js.native
    
    def remove(eObject: EObject): EList = js.native
    
    def rest(position: Double): js.Array[EObject] = js.native
    
    def size(): Double = js.native
  }
  @JSImport("ecore", "EList")
  @js.native
  def EList: EList = js.native
  inline def EList_=(x: EList): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EList")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "ELongObject")
  @js.native
  def ELongObject: ELongObject = js.native
  type ELongObject = EObject
  inline def ELongObject_=(x: ELongObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ELongObject")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "EMap")
  @js.native
  def EMap: EMap = js.native
  type EMap = EObject
  inline def EMap_=(x: EMap): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EMap")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "EModelElement")
  @js.native
  def EModelElement: EModelElement = js.native
  type EModelElement = EObject
  inline def EModelElement_=(x: EModelElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EModelElement")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "ENamedElement")
  @js.native
  def ENamedElement: ENamedElement = js.native
  type ENamedElement = EModelElement
  inline def ENamedElement_=(x: ENamedElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENamedElement")(x.asInstanceOf[js.Any])
  
  @js.native
  trait EObject extends StObject {
    
    var _id: String = js.native
    
    def create(attributes: js.Any): EObject = js.native
    
    var eClass: EClass = js.native
    
    var eContainer: EObject = js.native
    
    var eContainingFeature: EObject = js.native
    
    def eContents(): js.Array[EObject] = js.native
    
    def eResource(): Resource = js.native
    
    def eURI(): String = js.native
    
    def fragment(): String = js.native
    
    def get(feature: String): js.Any = js.native
    
    def getEObject(uri: String): EObject = js.native
    
    def getEStructuralFeature(feature: String): js.Any = js.native
    def getEStructuralFeature(feature: EObject): js.Any = js.native
    
    def has(name: String): Boolean = js.native
    
    def isKindOf(`type`: String): js.Any = js.native
    def isKindOf(`type`: EObject): js.Any = js.native
    
    def isSet(name: String): Boolean = js.native
    
    def isTypeOf(`type`: String): js.Any = js.native
    def isTypeOf(`type`: EObject): js.Any = js.native
    
    def set(attrs: js.Any, options: js.Any): EObject = js.native
    
    def setEClass(eClass: EClass): Unit = js.native
    
    def unset(attrs: js.Any, options: js.Any): EObject = js.native
  }
  @JSImport("ecore", "EObject")
  @js.native
  def EObject: EObject = js.native
  inline def EObject_=(x: EObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EObject")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "EOperation")
  @js.native
  def EOperation: EOperation = js.native
  type EOperation = ETypedElement
  inline def EOperation_=(x: EOperation): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EOperation")(x.asInstanceOf[js.Any])
  
  @js.native
  trait EPackage
    extends StObject
       with EObject {
    
    var Registry: EPackageRegistry = js.native
  }
  @JSImport("ecore", "EPackage")
  @js.native
  def EPackage: EPackage = js.native
  
  @js.native
  trait EPackageRegistry
    extends StObject
       with EObject {
    
    var Registry: EPackageRegistry = js.native
    
    def ePackages(): js.Array[EPackage] = js.native
    
    def elements(`type`: EObject): js.Array[EObject] = js.native
    
    def getEPackage(nsURI: String): EPackage = js.native
    
    def register(ePackage: EPackage): Unit = js.native
  }
  @JSImport("ecore", "EPackageRegistry")
  @js.native
  def EPackageRegistry: EPackageRegistry = js.native
  inline def EPackageRegistry_=(x: EPackageRegistry): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPackageRegistry")(x.asInstanceOf[js.Any])
  
  inline def EPackage_=(x: EPackage): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EPackage")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "EParameter")
  @js.native
  def EParameter: EParameter = js.native
  type EParameter = ETypedElement
  inline def EParameter_=(x: EParameter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EParameter")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "EReference")
  @js.native
  def EReference: EReference = js.native
  type EReference = EStructuralFeature
  inline def EReference_=(x: EReference): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EReference")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "EString")
  @js.native
  def EString: EString = js.native
  type EString = EObject
  inline def EString_=(x: EString): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EString")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "EStructuralFeature")
  @js.native
  def EStructuralFeature: EStructuralFeature = js.native
  type EStructuralFeature = ETypedElement
  inline def EStructuralFeature_=(x: EStructuralFeature): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EStructuralFeature")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "ETypeParameter")
  @js.native
  def ETypeParameter: ETypeParameter = js.native
  type ETypeParameter = ENamedElement
  inline def ETypeParameter_=(x: ETypeParameter): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ETypeParameter")(x.asInstanceOf[js.Any])
  
  @JSImport("ecore", "ETypedElement")
  @js.native
  def ETypedElement: ETypedElement = js.native
  type ETypedElement = ENamedElement
  inline def ETypedElement_=(x: ETypedElement): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ETypedElement")(x.asInstanceOf[js.Any])
  
  trait Edit extends StObject {
    
    def childDescriptors(`object`: EObject): js.Array[EObject]
    
    def childTypes(`object`: EObject, createDescriptor: js.Any): js.Array[EObject]
    
    def choiceOfValues(owner: EObject, feature: EObject): js.Array[EObject]
    
    def siblingDescriptors(`object`: EObject): js.Array[EObject]
    
    def siblingTypes(`object`: EObject, createDescriptor: js.Any): js.Array[EObject]
  }
  object Edit {
    
    @JSImport("ecore", "Edit")
    @js.native
    val ^ : Edit = js.native
    
    extension [Self <: Edit](x: Self) {
      
      inline def setChildDescriptors(value: EObject => js.Array[EObject]): Self = StObject.set(x, "childDescriptors", js.Any.fromFunction1(value))
      
      inline def setChildTypes(value: (EObject, js.Any) => js.Array[EObject]): Self = StObject.set(x, "childTypes", js.Any.fromFunction2(value))
      
      inline def setChoiceOfValues(value: (EObject, EObject) => js.Array[EObject]): Self = StObject.set(x, "choiceOfValues", js.Any.fromFunction2(value))
      
      inline def setSiblingDescriptors(value: EObject => js.Array[EObject]): Self = StObject.set(x, "siblingDescriptors", js.Any.fromFunction1(value))
      
      inline def setSiblingTypes(value: (EObject, js.Any) => js.Array[EObject]): Self = StObject.set(x, "siblingTypes", js.Any.fromFunction2(value))
    }
  }
  
  @JSImport("ecore", "JSObject")
  @js.native
  def JSObject: JSObject = js.native
  type JSObject = EObject
  inline def JSObject_=(x: JSObject): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("JSObject")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Resource
    extends StObject
       with EObject {
    
    def add(value: EObject): Unit = js.native
    
    def addAll(values: js.Array[EObject]): EObject = js.native
    
    def clear(): EList = js.native
    
    def each(iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ EList, Unit]): Unit = js.native
    def each(
      iterator: js.Function3[/* value */ js.Any, /* key */ js.Any, /* list */ EList, Unit],
      context: js.Any
    ): Unit = js.native
    
    def load(res: js.Any): Unit = js.native
    
    def parse(data: EObject): js.Any = js.native
    def parse(data: EObject, loader: js.Function0[Unit]): js.Any = js.native
    
    def remove(): Unit = js.native
    
    var rev: String = js.native
    
    def save(callback: js.Function0[Unit], options: js.Any): Unit = js.native
    
    def to(): js.Any = js.native
  }
  @JSImport("ecore", "Resource")
  @js.native
  def Resource: Resource = js.native
  
  @js.native
  trait ResourceSet
    extends StObject
       with EObject {
    
    def elements(): js.Array[EObject] = js.native
    def elements(`type`: String): js.Array[EObject] = js.native
    def elements(`type`: EClass): js.Array[EObject] = js.native
    
    def parse(data: EObject): Unit = js.native
    
    def toJSON(): js.Any = js.native
  }
  object ResourceSet {
    
    @JSImport("ecore", "ResourceSet")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(): ResourceSet = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ResourceSet]
  }
  
  inline def Resource_=(x: Resource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Resource")(x.asInstanceOf[js.Any])
  
  inline def create(eClass: EClass): EObject = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(eClass.asInstanceOf[js.Any]).asInstanceOf[EObject]
}
