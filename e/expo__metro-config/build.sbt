organization := "org.scalablytyped"
name := "expo__metro-config"
version := "0.3.22-0fa6b4"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "babel__code-frame" % "7.0-dt-20211202Z-480a63",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20220624Z-19cf66",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-558232",
  "org.scalablytyped" %%% "babel__parser" % "7.19.1-0f60fc",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-9d5df8",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220829Z-db75bf",
  "org.scalablytyped" %%% "babel__types" % "7.19.0-70b8c8",
  "org.scalablytyped" %%% "metro" % "0.66-dt-20220106Z-333896",
  "org.scalablytyped" %%% "metro-babel-transformer" % "0.66-dt-20211202Z-8167e2",
  "org.scalablytyped" %%% "metro-cache" % "0.66-dt-20211202Z-5eca59",
  "org.scalablytyped" %%% "metro-config" % "0.66-dt-20211202Z-1835b1",
  "org.scalablytyped" %%% "metro-core" % "0.66-dt-20211202Z-4f5cb9",
  "org.scalablytyped" %%% "metro-resolver" % "0.66-dt-20211202Z-e2847d",
  "org.scalablytyped" %%% "metro-source-map" % "0.66-dt-20211202Z-40c404",
  "org.scalablytyped" %%% "metro-transform-worker" % "0.66-dt-20211202Z-c41686",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
