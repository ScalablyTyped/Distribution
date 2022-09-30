organization := "org.scalablytyped"
name := "firebase__firestore-compat"
version := "0.1.25-6d413a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "firebase__app" % "0.7.33-ce1791",
  "org.scalablytyped" %%% "firebase__app-types" % "0.7.0-c681f7",
  "org.scalablytyped" %%% "firebase__auth-interop-types" % "0.1.6-ca0aef",
  "org.scalablytyped" %%% "firebase__component" % "0.5.17-85ef60",
  "org.scalablytyped" %%% "firebase__firestore" % "3.5.0-5c7c7b",
  "org.scalablytyped" %%% "firebase__firestore-types" % "2.5.0-a98c71",
  "org.scalablytyped" %%% "firebase__logger" % "0.3.3-a02e57",
  "org.scalablytyped" %%% "firebase__util" % "1.6.3-f102dd",
  "org.scalablytyped" %%% "grpc__grpc-js" % "1.7.1-b61edd",
  "org.scalablytyped" %%% "grpc__proto-loader" % "0.7.3-6ef219",
  "org.scalablytyped" %%% "long" % "5.2.0-9c1ab6",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "protobufjs" % "7.1.2-b9b4c1",
  "org.scalablytyped" %%% "rollup" % "2.79.1-091416",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "typescript" % "4.8.4-6579b4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
